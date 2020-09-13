package aula13;

// SUPER CLASSE
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    // Métodos de Animal

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    public abstract void emitirSom();
   
}
