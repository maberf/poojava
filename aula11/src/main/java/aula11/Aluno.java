package aula11;

public class Aluno extends Pessoa { // Uso de Herança
    // Se for escrito final entre public e class, vai transformar em classe final
    // Como Bolsita herda de Aluno, o Java já acusa os erros de sobrescrição.
    // Diferentemente de no método (linha 38), aqui envolve a classe inteira.
    // O extends na classe Bolsista já não vai funcionar. CLASSE FINAL NÃO ACEITA FILHOS!
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
    
     public void pagarMensalidade () {
         // Para transformar em método final, acrescentar a palavra final entre public e void. 
         // Na hora o Java já acusa que é substituído, NÃO PODE SER SOBREPOSTO!
        System.out.println("Pagando mensalidade de " + getNome() + ".");
    }
}
