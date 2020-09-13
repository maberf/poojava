package aula13;
public class Aula13 {
    public static void main(String[] args) {
        // EXERCÍCIO DE POLIMORFISMO DE SOBRECARGA
        
        Cachorro c = new Cachorro();
        //c.emitirSom();  // Poliformismo de Sobeposição mesma assinatura no emitirSom() 
        
        // Reações do Cachorro. Ir habilitando uma a uma e ir testando!
        c.reagir("Olá");            // Abanar e Latir
        c.reagir("Vai apanhar");    // Rosnar
        c.reagir(11,45);           // Abanar
        c.reagir(21,00);           // Ignorar
        c.reagir(true);             // Abanar
        c.reagir(false);            // Rosnar e latir
        c.reagir (2,12.5f);          // Latir
        c.reagir (17,4.5f);          // Rosnar
    }
    
}
