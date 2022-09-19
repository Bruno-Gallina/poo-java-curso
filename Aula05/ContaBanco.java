package aula05;

public class ContaBanco { // Classe ContaBanco
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo; // tipo Real
    private boolean status;
    // Métodos Personalizados
    
    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
            
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true); // Utiliza método modificador
        //this.status = true; // Utiliza diretamente acesso ao atributo
        if ("CC".equals(t)) { // alt. "CC".equals(t)
            //this.saldo = 50;
            this.setSaldo(50);
        } else if ("CP".equals(t)) { // alt. "CP".equals(t) // t == "CP"
            //this.saldo = 150;
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }    
     
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada poque ainda tem dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v) {
        //if (this.status == true)
        if (this.getStatus()) {
            //this.saldo = this.saldo + v; // Altera diret. os atrib.
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");     
        }
    }
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v); // trab. com método
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    
    }
    public void pagarMensalidade() {
        int v; // Variável local    
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    
    }
    // Métodos Especiais
    
    // Método Construtor 
    // ctrl + i -> inserir código -> Constructor... ->
    public void ContaBanco() {
        //this.saldo = 0;
        this.setSaldo(0);
        //this.status = false;
        this.setStatus(false);
    }

    /*public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() { // Sem void pois esse método retorna
        return this.numConta;
    }
    public void getDono() {
        
    }
   */

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
