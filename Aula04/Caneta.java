package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }
    
    
    /*public Caneta(String m, String c, float p) { // Este é o método construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p; // ou this.setPonta(p); porém precisa dos métodos set e get
        this.tampar();
        
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        //System.out.println("Modelo: " + this.getModelo()); // Funciona igual a linha superior this.modelo
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
   */ 

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
