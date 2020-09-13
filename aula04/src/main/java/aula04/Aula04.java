package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta ("Mont Blanc", 0.7f, "Preta");
        Caneta c2 = new Caneta ("Xing Ling", 0.8f, "Vermelha");
               
        System.out.println("Tenho uma caneta " + c1.getModelo() 
        + " de ponta " + c1.getPonta()
        + " de cor " + c1.getCor()
        + " e ela está tampada: " + c1.getTampada());
        
        System.out.println("Tenho uma caneta " + c2.getModelo() 
        + " de ponta " + c2.getPonta()
        + " de cor " + c2.getCor()
        + " e ela está tampada: " + c2.getTampada());
    }
        
}
