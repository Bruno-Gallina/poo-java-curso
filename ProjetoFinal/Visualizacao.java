package com.mycompany.projetofinal;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    // Métodos com mesmo nome e assinaturas diferentes (sobrecarga)
    
    public void avaliar() {
        this.filme.setAvaliacao(5); // Avaliar sem parâmetro > padrão nota 5
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota); // Nota do input do usuário
    }
    
    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) { // Se assistir até 20% do video, nota 3
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10; // Assistir acima de 90% do video, nota é 10
        }
        this.filme.setAvaliacao(tot);
    }
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
