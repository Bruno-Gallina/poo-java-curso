package aula09;

public class Livro implements Publicacao {
    // Atributos
    private String titulo, autor;
    private int totPaginas, pagAtual, pagMarcada;
    private boolean aberto, fechado;
    private Pessoa leitor;
    
    // Métodos

    public String detalhes() {
        return "Livro{" + "Titulo = " + titulo + ",\n Autor = "
                + autor + ",\n Total de Páginas = " + this.getTotPaginas()
                + ",\n Página Atual = " + this.getPagAtual() + ",\n Página marcada = " + pagMarcada + ",\n Aberto = "
                + aberto + '}' + "\n\nLeitor{" + "Nome = " + leitor.getNome()
                + ",\n Idade = " + leitor.getIdade()
                + ",\n Sexo = " + leitor.getSexo() + '}';
    }
    
    // Método Construtor 
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0; 
        this.aberto = false;
        this.leitor = leitor;
         
        
    }
    
    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    // Métodos Abstratos
    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        if (this.aberto == true) {
            this.aberto = false;
            this.pagMarcada = this.pagAtual;
            this.pagAtual = 0;
            System.out.println("O livro foi fechado!");
            
        } else {
            System.out.println("O livro já está fechado!");
        }
    }

    @Override
    public void folhear(int pag) {
        if (pag > this.getTotPaginas()) {
            this.pagAtual = 0;
            System.out.println("Impossível folhear!");
        } else {
            this.pagAtual = pag;
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto == true && this.pagAtual >= 0 && this.pagAtual < this.totPaginas) {
            this.pagAtual++;
        } else {
            System.out.println("Impossível Avançar!");
        }
    }

    @Override
    public void voltarPag() {   
        if (this.aberto ==  true && this.pagAtual > 0) {
            this.pagAtual--;
        } else {
            System.out.println("Impossível voltar página!");
        }
        
    }
    public void marcador(int pagMarcada) {
        this.pagMarcada = pagMarcada;
    }
    
}
