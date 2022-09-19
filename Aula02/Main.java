// Classe principal
class Main {
  // Método Main
  public static void main (String [] args) {
  
    Caneta c1 = new Caneta(); // Criando objeto p1 referente a caneta
    c1.modelo = "BIC Cristal";
    c1.cor = "Azul";
    c1.ponta = 0.5f;
    c1.carga = 80;
    c1.tampada = false;
    c1.status();
    c1.rabiscar();
    // c1.destampar();
    
    Caneta c2 = new Caneta(); // Objeto p2
    c2.modelo = "model2";
    c2.cor = "Preta";
    c2.destampar();
    c2.rabiscar();
    c2.status();
  }
}
