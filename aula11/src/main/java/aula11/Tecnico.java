package aula11;

public class Tecnico extends Aluno {
    private int registro;
    
    // Métodos Internos

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    public void praticar () {
        System.out.println(getNome() + " é técnico e está praticando.");
    }
}
