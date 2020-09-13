package aula13;
public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    // Poliformismo de Sobrecarga
    // Mesma Classe, Métodos com Assinaturas Diferentes
    
    public void reagir (String frase) { // Método 
        if (frase == "Toma Comida" || frase == "Olá") {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
     public void reagir (int hora, int min) {
        if (hora<12) {
            System.out.println("Abanar");
        } else if (hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }
     
      public void reagir (boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }
       
      public void reagir (int idade, float peso) {
          if (idade < 5) {
              if (peso < 10) {
                  System.out.println("Abanar");
              } else {
                  System.out.println("Latir");
              }
          } else {
              if (peso < 10) {
                  System.out.println("Rosnar");
              } else {
                  System.out.println("Ignorar");
              }
          } 
    }
    //  public void reagir (String voz) { // Mesma assinatura do método da linha 12, dá erro!
    //} 
    
    //public void reagir (float x, int y) { // Não é mesma assinatura do método da linha 24, não daria erro!
    //}                                     // Apesar de duas variáveis de mesmo tipo, estão e ordem inversa.
}
