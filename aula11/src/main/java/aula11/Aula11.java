package aula11;

public class Aula11 {
    public static void main(String[] args) {
        // PROGRAMA PRINCIPAL
        
        // Instanciamento de Objetos
        
        // Pessoa p1 = new Pessoa(); // Pessoa é uma classe abstrata e não pode ser instanciada. Dá erro!
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista ();
        Tecnico t1 = new Tecnico ();
        
        v1.setNome("Filisberto"); // Teste do Visitante
        v1.setSexo("M"); 
        v1.setIdade(28);
        
        a1.setNome("Zeferino"); // Teste do Aluno
        a1.setSexo("M"); 
        a1.setIdade(18);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        
        b1.setNome("Tertulhano"); // Teste do Bolsista
        b1.setSexo("M");
        b1.setBolsa(1500.50f);
        b1.renovarBolsa();
        b1.pagarMensalidade(); // Sobreposição. Se for transformado o método pagarMensalidade para final dentro da classe Aluno vai dar erro aqui.
        
        t1.setNome("Orozimbo"); // Teste do Aluno
        t1.setSexo("M"); 
        t1.setIdade(22);
        t1.praticar();
        
        // Outputs toString
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(t1.toString());
        
    }
    
}
