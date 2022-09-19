package aula05;

public class Aula05 { // Classe principal
    
    public static void main(String[] args) { // Método Main
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco(); // Objeto p1
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
