package aula10;

public class Aula10 {
    public static void main(String[] args) {
        // PROGRAMA PRINCIPAL
        
        // Instanciamento de Objetos
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M"); // Algumas informações para teste
        p4.setSexo("F");
        p2.setIdade(18);
              
        p2.setCurso("Informática"); // Outras informações, mas que são de outras classes
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        //p1.receberAum(550.20f); // Dá erro em p1, porque não é classe que tenha salario. Teria que ser p3.
        //p2.mudarTrabalho();  // Dá erro em p2, porque não é classe que tenha salario. Teria que ser p4.
        //p4.cancelarMatr(); // Dá erro em p4, porque não é classe que tenha salario. Teria que ser p2.
        
        //p2.setCurso("Informatica");
        //p3.setSalario(2500.75);
        //p4.setSetor("Estoque");
        
        // Outputs toString
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
