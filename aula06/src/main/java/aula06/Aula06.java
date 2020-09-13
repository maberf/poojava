package aula06;
public class Aula06 {
public static void main(final String[] args) {
    // CONTROLE REMOTO
    // Uso através da interface (ENCAPSULAMENT0)
    // Getters e Setters são privados, mas o Construtor é público (ainda...)

    final ControleRemoto c = new ControleRemoto();
   // Agora pode-se "brincar" com os controles da interface Controlador. Atenção aos valores iniciais no Construtor
   // Perceber a simplicidade e intuição dos comandos
    c.ligar();
    // c.desligar(); // desligo o aparelho para simular uma mensagem de erro no volume
    c.maisVolume(); 
    c.play();
    c.abrirMenu();
    c.fecharMenu();
    
    }
    
}
