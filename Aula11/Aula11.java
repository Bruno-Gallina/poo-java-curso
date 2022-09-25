package aula11;

/**
 *
 * @author brunei
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*//Pessoa p1 = new Pessoa(); abstract error
        Visitante v1 = new Visitante();
        v1.setNome("Cleiton");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Cleyton");
        a1.setMatricula(221021225);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(10203012);
        b1.setNome("Iguinho");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Winderson");
    }
    
}
