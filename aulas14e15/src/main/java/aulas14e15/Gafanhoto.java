package aulas14e15;
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    
    // Métodos Internos

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    // Notar como ocorre a amarração com o construtor da superclasse
    // O gafanhoto tem que informar nome, idade, sexo e login
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistino() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    // Métodos
    
    public void viuMaisUM() {
        
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
