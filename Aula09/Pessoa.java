package aula09;

public class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;
    
    // Métodos Públicos
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    
    // Método Especial
    
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public void fazerAniver() {
        this.idade++;
    }

}    
