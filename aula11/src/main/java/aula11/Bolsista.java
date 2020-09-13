package aula11;

public class Bolsista extends Aluno {
    private float bolsa;
    
    // Métodos Internos

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    // Métodos
    
    public void renovarBolsa () {
       System.out.println("Renovando bolsa de " + getNome() + ".");
    }
    
    @Override //Método sobreposto, sobrepõe ao pagar mensalidade da classe Aluno
    public void pagarMensalidade () { 
       System.out.println(getNome() + " é bolsista. Pagando mensalidade.");
   }
}
