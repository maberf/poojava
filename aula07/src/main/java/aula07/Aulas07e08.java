package aula07;

public class Aulas07e08 {
    public static void main(String[] args) {
    // PROJETO ULTRA EMOJI COMBAT
    
    // Cadastramento dos Lutadores através de vetor
    Lutador lut[] = new Lutador [6];
    lut[0] = new Lutador ("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
    lut[1] = new Lutador ("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
    lut[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
    lut[3] = new Lutador ("Deadcode", "Autralia", 28, 1.93f, 81.6f, 13, 0, 2);
    lut[4] = new Lutador ("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
    lut[5] = new Lutador ("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
    
    /*// Outputs - Simulações da Aula 07, tirar os /* das linhas 15 e 24
    // Apresentação dos Lutadores
    lut[4].apresentar();
    lut[5].apresentar();
    // Luta e 4 com 5, 4 ganha e 5 perde. Aumenta a vitória de 4 e a derrota de 5.
    lut[4].ganharLuta();
    lut[5].perderLuta();
    // Status após a Luta
    lut[4].status();
    lut[5].status();*/
    
    // Outputs - Simulações da Aula 08, basta trocar os valores nos vetores para torcar os lutadores
    Luta UEC01 = new Luta ();
    UEC01.marcarLuta(lut[4], lut[5]);
    UEC01.lutar();
    
    }
   
}
