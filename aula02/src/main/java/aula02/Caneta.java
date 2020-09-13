package aula02;

public class Caneta {
    String modelo;  // Atributos
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status () { // Método
        System.out.println("Informações da Caneta:");
        System.out.println("Modelo - " + this.modelo);
        System.out.println("Cor - " + this.cor);
        System.out.println("Ponta - " + this.ponta);
        System.out.println("Carga - " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar() {  // Método teste rabiscar
        if (this.tampada == true) {
            System.out.println("ERRO: Inviável rabiscar!");
        } else {
            System.out.println("Caneta rabiscando!");
        }
    }
        void tampar () {
        this.tampada = true; // Método altera tampada
    }
        void destampar () {
        this.tampada = false; // Método altera tampada
    }
    }
