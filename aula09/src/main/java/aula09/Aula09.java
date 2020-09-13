package aula09;

public class Aula09 {
public static void main(String[] args) {
    
    // Carregamento das Pessoas e Livros
    Pessoa[] pes = new Pessoa[2];
    Livro[] liv = new Livro[2];
    
    pes[0] = new Pessoa ("Jose", 35, "M");
    pes[1] = new Pessoa ("Maria", 25, "F");
    
    liv[0] = new Livro ("Cozinha Chinesa", "Xing Ling", 500, pes[1]); // Observe o obejto instanciado dentro do veotr de outro elemento
    liv[1] = new Livro ("Mecânica Prática", "Janjão da Oficina", 200, pes[0]);
    
    // Saída dos dados com o método toString renomeado em detalhes ()
    System.out.println("========Livro 0===============");
    liv[0].abrir();
    liv[0].folhar(100);
    liv[0].avancarPag();
    liv[0].avancarPag();
    System.out.println(liv[0].detalhes());
    
    System.out.println("========Livro 1===============");
    liv[1].abrir();
    liv[1].fechar();
    liv[1].folhar(100);
    
    System.out.println(liv[1].detalhes());
    
    
    /* Abaixo uma solução criada pelo Maber
    Diferentemente do Guanabara, não utilizei vetores neste código.
    Preferi a solução com a escrita de combinações de livro x e pessoa y.
    Daria no mesmo que solução do Guanabara, só que ele amarra a pessoa dentro do vetor livro. Poderia see desta forma também.
    No exempo temos a pessoa pes1 e o livro liv1. Poderiam-se utlizar pes2 e liv2, pes1 e liv2, etc.
    Objetivo é entender a escrita do código em POO Java.
    PORÉM, DESTA FORMA NÃO FOI POSSÍVEL MANTER OS ATRIBUTOS PRIVADOS NA CLASSE, pois é necessário atuar em getters e setters.
    
    //  Pessoas
    Pessoa pes1 = new Pessoa ("Joao", 25, "masculino");
    
    // Livros
    Livro liv1 = new Livro ("O Príncipe", "Maquiavel", 100);
    
    // Combinações de Pessoas e Livros
    liv1.lerLivro(pes1); //Livro X sendo lido pela pessoa Y
    
    // Saída de Pessoas e Livros
    System.out.println("========Feito pelo Maber==========");
    System.out.println(pes1.getNome() + " com "
        + pes1.getIdade() + " anos, do sexo "
        + pes1.getSexo() + ", está lendo um livro.");
    System.out.println("O livro " + liv1.getTitulo()  + ", de autoria de "
        + liv1.getAutor() + ", com "
        + liv1.getTotPaginas() + " páginas, está sendo lido por " + liv1.leitor.getNome() + ".");
    System.out.println("O livro está inicialmente aberto? " + liv1.isAberto() + ".");
    
    // Simulações de Manuseio
    liv1.abrir();
    // Testes de avançar e voltar páginas até totPaginas. Por totPaginas = 3 no liv1
    //liv1.fechar();
    //liv1.avancarPag();
    //liv1.avancarPag(); // Avança só até  3.
    //liv1.avancarPag();
    //liv1.voltarPag();
    //liv1.voltarPag();
    //liv1.voltarPag(); // Volta só até a 1
    //liv1.voltarPag();
    liv1.folhar(150);   // Caso folhar mais páginas que o livro tem, ficar na última página. Siolução diferente do Guanabara.
    liv1.avancarPag();
    
    // Saídas de Manuseio dos Livros
    System.out.println("A leitura está na página " + liv1.getPagAtual() + ".");
    */
}
    
}
