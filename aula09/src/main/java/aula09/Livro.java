package aula09;

public class Livro implements Publicacao {
    
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // O leitor é um objeto pessoa, agregação de objetos
    
    // Métodos Especiais

    public Livro(String ti, String au, int to, Pessoa le) { // Construtor
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = to;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = le;
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String ti) {
        this.titulo = ti;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String au) {
        this.autor = au;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int to) {
        this.totPaginas = to;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // Métodos

    public String detalhes() {  // Utilização de método toString renomeada! (carta na manga). Sem o Override;
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor 
                + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual 
                + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + '}';
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
        System.out.println("Livro aberto.");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
        System.out.println("Livro fechado.");
    }

    @Override
    public void folhar(int p) {
        //this.setPagAtual(p);
       if (isAberto()) {
            if ( p < getTotPaginas()) {
                this.setPagAtual(p);
            } else {                // Diferente do Guanabara, fiz folhar > totPaginas, fiz pagina atual valer a pagina final.
                this.setPagAtual(getTotPaginas());
                System.out.println("Folhado até a última página do livro.");
            } 
        } else {
            System.out.println("Livro fechado. Impossível folhar!");
        } 
    }

    @Override
    public void avancarPag() {
        if (isAberto()) {
            if (getPagAtual() < getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() + 1);
            } else {
                System.out.println("Avançado até a última página do livro.");
            } 
        } else {
            System.out.println("Livro fechado. Não pode avançar página!");
        }
    }

    @Override
    public void voltarPag() {
        if (isAberto()) {
            if (getPagAtual() > 1) {
                this.setPagAtual(this.getPagAtual() - 1);
            } else {
                System.out.println("Voltado até a primeira página do livro.");
            } 
        } else {
            System.out.println("Livro fechado. Não pode retroceder página!");
        }
    }
    
    public void lerLivro (Pessoa leitor) {
        this.setLeitor(leitor);
    }
}
