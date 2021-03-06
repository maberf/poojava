package aula10;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Métodos Internos - sem construtor

    /* public Pessoa(String nome, int idade, String sexo) { // Sem construtor.
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    } */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // Métodos 
    
    public void fazerAniv () {
        setIdade(getIdade()+1); // poderia ser o comando direto no atributo: this.idade++ 
    }
    
    // Output toString

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
