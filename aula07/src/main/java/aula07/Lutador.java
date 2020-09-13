package aula07;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos Especiais Internos da Classe
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe); // Tem que usar setter para ativar o cálculo do peso e da categoria
        // this.categoria = ca não usado, pois é calculada através do peso, não precisa ser imputada
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() { // public para viabilizar a agregação com Luta
        return nome;
    }

    private void setNome(String no) {
        this.nome = no;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int id) {
        this.idade = id;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float al) {
        this.altura = al;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria(); // Chama o setCategoria para cálculo da categoria
    }

    public String getCategoria() { // public para viabilizar a agregação com Luta
        return categoria;
    }

    private void setCategoria() {
        if (getPeso() < 52.2 || getPeso() > 120.2) { // Feito com gets e não direto
            this.categoria = "Inválido";
        } else if (getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9) {
            this.categoria = "Medio";
        } else if (getPeso() <= 120.2) {
            this.categoria = "Pesado";
        }
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vi) {
        this.vitorias = vi;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int de) {
        this.derrotas = de;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int em) {
        this.empates = em;
    }
    
    // Métodos

    public void apresentar() {
        //System.out.println("---------------------");
        System.out.println("APRESENTAMOS " + getNome());
        System.out.println("Vindo diretamente de " + getNacionalidade());
        System.out.println("Idade " + getIdade() + " anos");
        System.out.println("Altura " + getAltura() + " metros");
        System.out.println("Pesando " + getPeso() + " Kg");
        System.out.println("Com " + getVitorias() + " vitorias" + ", " + getDerrotas() + " derrotas" + " e " + getEmpates() + " empates" );
        System.out.println("Categoria " + getCategoria());       
    }

    public void status() {
        System.out.println("---------------------");
        System.out.println("Após a luta " + getNome() + " com " + getVitorias() + " vitorias" + ", " + getDerrotas() + " derrotas" + " e " + getEmpates() + " empates" );
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
         this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
