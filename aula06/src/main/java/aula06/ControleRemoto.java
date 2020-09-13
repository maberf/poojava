package aula06;
public class ControleRemoto implements Controlador {
// Classe Controle Remoto
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {  // is = get em booolean, o padrão é is.
        return ligado;
    }

    private void setLigado(boolean ligado) { // is = get em booolean, o padrão é is.
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos - Implementação Controlador

    @Override
    public void ligar() {
        this.setLigado(true); // Liga
    }

    @Override
    public void desligar() {
        this.setLigado(false); // Desliga
    }

    @Override
    public void abrirMenu() { // Menu
        System.out.println("--------MENU--------");
        System.out.println("Ligado? " + this.isLigado());
        System.out.println("Tocando? " + this.isTocando());
        System.out.print("Volumne: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) { // Barra de Volume
            System.out.print("|"); // Escreve a Barra de volume
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado () == true) { // Não precisaria do == true, deixado só nesse caso.
            this.setVolume(this.getVolume() + 5); // Aninhamento para aumentar em 5 escalas
        } else {
            System.out.println("Controle desligado, impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado ()) { // Sem o == true, funciona do mesmo jeito.
            this.setVolume(this.getVolume() - 5); // Aninhamento para diminuir 5 escalas
        } else {
            System.out.println("Controle desligado, impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado () ) { // Não precisa do teste E feito pelo Guanabara!
            this.setVolume(0); // Seta volume zero, mudo
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado () ) { // Não precisa do teste E feito pelo Guanabara!
            this.setVolume(50); // Seta volume em 50, valor médio padrão
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando())  {
            this.setTocando(true); // Ativa o play    
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando())  {
            this.setTocando(false); // Pausa
        }
    }
    
    // Se necessário mais código, seguir daqui
}
