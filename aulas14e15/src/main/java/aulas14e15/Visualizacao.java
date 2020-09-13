package aulas14e15;
public class Visualizacao {
    private Gafanhoto espectador;  // Agregação
    private Video filme;
    
    // Métodos Internos

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistino() + 1);
        // Incrementa total de videos do espectador cada vez que assiste um video
        this.filme.setViews(this.filme.getViews()+1);
         // Incremento da quantidade de views do video cada vez que o video é assistido
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    // Métodos de Sobrecarga
    
    public void avaliar () { 
        // Se eu avaliar sem nota, a nota é 5.
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar (int nota) {
        // Se eu passar a nota, vale a nota
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar (float porc) {
        // Se eu passar um percentual, o código gera uma nota 
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else  if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
           tot = 10; 
        }
        this.filme.setAvaliacao(tot);

}
      
    
}
