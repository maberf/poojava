package aula04;

public class Caneta {
    public String modelo; // Atributo
    private float ponta; // Atributo
    private String cor;  // Atributo
    private boolean tampada; // Atributo
        
    public Caneta (String m, float p, String c) { // Construtor com variáveis
        this.modelo = m; // Variável
        this.ponta = p; // Variável
        this.cor = c; // Variável
        this.tampar(); // Default que força o tampar
    }
    
    public String getModelo() { // Acessor
        return this.modelo;
    }
    public void setModelo(String m) { // Modificador
        this.modelo = m;
    }
    public float getPonta() { // Acessor
        return this.ponta;
    }
    public void setPonta (float p) { // Modificador
        this.ponta = p;
    }
    public String getCor() { // Acessor
        return this.cor;
    }
    public void setCor (String c) { // Modificador
        this.cor = c;
    }
    public boolean getTampada() { // Acessor
        return this.tampada;
    }
    public void setTampada (boolean t) { // Modificador
        this.tampada = t;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar () {
        this.tampada = false;
    }
    
}

