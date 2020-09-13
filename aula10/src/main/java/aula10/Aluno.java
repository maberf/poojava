package aula10;

public class Aluno extends Pessoa { // Uso de Herança
    private int matr;
    private String curso;
    
    // Métodos Internos - sem construtor

    /* public Aluno(int matr, String curso) { // Sem o construtor
        this.matr = matr;
        this.curso = curso;
    } */

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Métodos
    
    public void cancelarMatr () {
        System.out.println("Matricula cancelada!");
    }
    
}
