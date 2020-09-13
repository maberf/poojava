package aula05;

public class Aula05 {
    /**
     * Projeto de uma ContaBanco
     * https://www.youtube.com/watch?v=ull_DVFFOq0&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=10
     * Ver os detalhes no video. 
     * AbertuAula05de CC recebe 50 do banco e abertura poupança recebe 150 do banco
     */
    public static void main(final String[] args) {
        // Entrada dos dados dos clientes c1 e c2
        // Default tipo CC, saldo zero e conta fechada - status false
        final ContaBanco c1 = new ContaBanco(111, "CC", "Jubileu", 0, false);
        final ContaBanco c2 = new ContaBanco(222, "CC", "Creusa", 0, false);
        
    // Abertura das contas. Aparecem créditos e tipo da Creusa muda
        c1.abrirConta("CC");
        c2.abrirConta("CP");
        
    // Depósitos
        c1.depositar(100);
        c2.depositar(500);
        
    // Saques
        c1.sacar(30);
        c2.sacar(200);
        
    // Tentativa de saque maior que o saldo
        c1.sacar(300);
        
    // Tentativa de fechamento da conta da Creusa
        c2.fecharConta();
        
    // Fechamento da conta do Jubileu
        c1.sacar(120);
        c1.fecharConta();
        
    // Output
        System.out.println("----------------------------------");
        System.out.println (
        " Conta " + c1.getNumConta()
        + " Tipo " + c1.getTipo()
        + " Dono " + c1.getDono()
        + " Saldo " + c1.getSaldo()
        + " Status " + c1.getStatus());
        
        System.out.println("----------------------------------");
        System.out.println (
        " Conta " + c2.getNumConta()
        + " Tipo " + c2.getTipo()
        + " Dono " + c2.getDono()
        + " Saldo " + c2.getSaldo()
        + " Status " + c2.getStatus());
    }
}
