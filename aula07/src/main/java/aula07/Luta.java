package aula07;

import java.util.Random; // importação do pacote Java Util

public class Luta {
// Atributos
    private Lutador desafiado;  // Desafiado e desafiante devem ser diferentes
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
// Métodos Especiais Internos da Classe

    /*private Luta(int ro) { // Construtor só para rounds?
        this.rounds = ro;  
        
    }*/

    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int ro) {
        this.rounds = ro;
    }

    private boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean ap) {
        this.aprovada = ap;
    }

// Métodos   
    
    public void marcarLuta(Lutador lut1, Lutador lut2) {
        if (lut1.getCategoria().equals(lut2.getCategoria()) && lut1.getNome() != lut2.getNome()) {
            this.setAprovada(true);
            this.setDesafiado(lut1);
            this.setDesafiante(lut2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (isAprovada() == true) {
            System.out.println("----- DESAFIADO------");
            desafiado.apresentar();
            System.out.println("----- DESAFIANTE------");
            desafiante.apresentar();
            Random aleatorio = new Random (); // algoritmo de random do Java
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor) {  // estrutura de repetição switch
                case 0: // Empate
                    System.out.println("-----RESULTADO DA LUTA-------");
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println("-----RESULTADO DA LUTA-------");
                    System.out.println("Vitória de " + this.desafiado.getNome()); //Puxa o nome de dentro da classe Lutador
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println("-----RESULTADO DA LUTA-------");
                    System.out.println("Vitória de " + this.desafiante.getNome()); // Puxa o nome de dentro da classe Lutador
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    
}
