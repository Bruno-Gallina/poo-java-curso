package aula07;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos Públicos
    
    public void apresentar() {
        System.out.println("IIIIIIIIIIIIITS TIMEEEEEEEEEEEEEEEEE!");
        System.out.println("Apresentando o lutador " + this.getNome());
        System.out.println("De nacionalidade " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + "anos e " + this.getAltura() + "m");
        System.out.println("Pesando " + this.getPeso() + " kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        
    }
    
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Com " + this.getVitorias() + " vitória(s)");
        System.out.println(this.getDerrotas() + " derrota(s)");
        System.out.println(this.getEmpates() + " empate(s)");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Método Construtor
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        //this.nome = "no";
        this.nome = nome; // this.setNome(nome);
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
    }
   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public String getNacionalidade() {
       return nacionalidade;
   }
   public void setNacionalidade(String nacionalidade) {
       this.nacionalidade = nacionalidade;
   }
   public int getIdade() {
       return idade;
   }
   public void setIdade(int idade) {
       this.idade = idade; 
   }
   public String getCategoria() {
       return categoria;
   }
   public void setCategoria() {
       if (getPeso() < 52.2) {
           this.categoria = "Inválido!";
       } else if (this.peso <= 70.3) {
           this.categoria = "leve";
       } else if (this.peso <= 83.19) {
           this.categoria = "Médio";
       } else if (this.peso <= 120.2) {
           this.categoria = "Pesado";
       } else {
           this.categoria = "Inválido";
       }
   }
   public float getAltura() {
       return altura;
   }
   public void setAltura(float altura) {
       this.altura = altura;
   }
   public float getPeso() {
       return peso;
   }
   public void setPeso(float peso) {
       this.peso = peso;
       this.setCategoria();
   }
   public int getVitorias() {
       return vitorias;
   }
   public void setVitorias(int vitorias) {
       this.vitorias = vitorias;
   }
   public int getDerrotas() {
       return derrotas;
   }
   public void setDerrotas(int derrotas) {
       this.derrotas = derrotas;
   }
   public int getEmpates() {
       return empates;
   }
   public void setEmpates(int empates) {
       this.empates = empates;
   }
   
    
}
