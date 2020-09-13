package aula12;
public class Peixe extends Animal {
    private String corEscama;
    
    // Métodos de Peixe

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");    
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo plâncton");    
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");    
    }
    
    // Métodos da Classe Peixe
    public void soltarBolha() {
       System.out.println("Soltar uma bolha");    
    }
    
}
