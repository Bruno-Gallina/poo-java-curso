package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Bruno", 18, "M");
        p[1] = new Pessoa("Maria", 32, "F");
        
        l[0] = new Livro("Moonwalking with Einstein", "Dont Know", 300, p[0]);
        l[1] = new Livro("Java for Dummies", "Prof Lino", 366, p[1]);
        l[2] = new Livro("A arte da Guerra", "Samurai", 155, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
    
}
