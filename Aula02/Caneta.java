public class Caneta {
  // Atributos
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;
  
  // Métodos Especiais
  
  public void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga + " %");
    System.out.println("Está tampada? " + this.tampada);
        
  }
    
  public void rabiscar() {
    if (this.tampada == true) {
      System.out.println("ERRO! Não posso rabiscar");
    } else {
      System.out.println("Estou Rabiscando");
    }
  }
    
  public void tampar() {
    if (this.tampada == false) {
      this.tampada = true;  
    } else {
      System.out.println("A caneta já está tampada");
    }     
    
  }
    
  public void destampar() {
      if (this.tampada == true) {
        this.tampada = false;
      } else {
        System.out.println("A caneta já está destampada ");
      }
        
  }
}
