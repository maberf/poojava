package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta (); // Instanciamento caneta 1
        c1.modelo = "Bic"; // Estabelecimento de atributos
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampar ();
        //c1.status();  // Chamada à método. Tem parênteses.
        c1.rabiscar();
        
        Caneta c2 = new Caneta (); // Instanciamento caneta 2
        c2.modelo = "Compactor"; // Estabelecimento de atributos
        c2.cor = "Vermelha";
        c2.ponta = 0.8f;
        c2.carga = 80;
        c2.destampar ();
        //c2.status();  // Chamada à método. Tem parênteses.
        c2.rabiscar();
    }
    
}
