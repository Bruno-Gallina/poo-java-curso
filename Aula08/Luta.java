package aula07;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;



// Métodos Públicos
    
public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
}

public Lutador getDesafiado() {
    return this.desafiado;
}

public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
}

public Lutador getDesafiante() {
    return desafiante;
}
public void setRounds(int rounds) {
    this.rounds = rounds;
}
public int getRounds() {
    return this.rounds;
}
public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
}
public boolean getAprovada() {
    return this.aprovada;
}
public void marcarLuta(Lutador l1, Lutador l2) {
    if (l1 != l2 && l1.getCategoria().contentEquals(l2.getCategoria())) {
        this.setAprovada(true);
        this.setDesafiado(l1);
        this.setDesafiante(l2);
    } else {
        this.setAprovada(false);
        this.setDesafiado(null);
        this.setDesafiante(null);
    }
}

public void lutar() {
    if (this.getAprovada()) {
        System.out.println("### DESAFIADO ###");
        this.getDesafiado().apresentar();
        System.out.println("DESAFIANTE");
        this.getDesafiante().apresentar();
        Random gerador = new Random();
        int vencedor = gerador.nextInt(3); // 0 1 2
        System.out.println("----- RESULTADO DA LUTA -----");
        
        switch(vencedor) {
            case 0 -> { // Empate
                System.out.println("Empate!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;   
            }
            case 1 -> { // Vitória do Desafiado
                System.out.println("Vitória do desafiado!" + this.getDesafiado().getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
            }
            case 2 -> { // Vitória do Desafiante
                System.out.println("Vitória do desafiante!" + this.getDesafiante().getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;
            }
                 
        }
        
        System.out.println("-------------------");
        
    } else {
        System.out.println("A luta não pode acontecer!");
    }
 }


}
