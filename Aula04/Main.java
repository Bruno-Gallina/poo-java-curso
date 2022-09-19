package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f); // Criação do Objeto Caneta
        c1.status();
        Caneta c2 = new Caneta("TRX", "Preta", 1.5f);
        c2.status();
        //c1.setModelo("BIC"); // Método acessor
        //c1.modelo = "BIC"; // Acessa diretamente o atributo
        
        //c1.setPonta(0.5f); // f para float
        //c1.ponta = 0.5f;
     
        
         //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
         
         // Método set e get servem para não ter acesso diretamente ao atributo
        
    }
    
}
