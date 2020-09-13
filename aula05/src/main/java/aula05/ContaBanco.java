package aula05;
public class ContaBanco {
 // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
// Construtor
    public ContaBanco(int n, String t, String d, float v, boolean s) {
        this.numConta = n;
        this.tipo = t;
        this.dono = d;
        this.saldo = v;
        this.status = s;
    }

// Métodos Especiais
//Getters e Setters para acesso indireto aos atributos
    public int getNumConta() {
        return numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public String getDono() {
        return dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public void setSaldo(float v) {
        this.saldo = v;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }

// Métodos Personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta() {
        if (saldo > 0 ) {
            System.out.println("Não permitido fechar conta com saldo!");  
        } else if (saldo < 0) {
            System.out.println("Não permitido fechar conta com débito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito feito na conta de " + this.getDono());
        } else {
            System.out.println("Conta fechada, não possível depositar");
        }
    }
    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque feito na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            } 
        } else {
            System.out.println("Conta fechada, impossível sacar");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Conta fechada, impossível pagar mensalidade");
        }
    }
    
    }


