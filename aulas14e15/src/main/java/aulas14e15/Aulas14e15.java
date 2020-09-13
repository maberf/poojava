package aulas14e15;
public class Aulas14e15 {
public static void main(String[] args) {
    
    // VIDEOS e GAFANHOTOS
    
    Video v[] = new Video [3];

    v[0] = new Video("Star Wars");
    v[1] = new Video("Shrek");
    v[2] = new Video("O Gangster");
    
    Gafanhoto g[] = new Gafanhoto[2];
    g[0] = new Gafanhoto ("Raimundo", 20, "M", "rai2000@xpto.com");
    g[1] = new Gafanhoto ("Creusa", 19, "F", "cre2001@xpto.com");
    
    //System.out.println(v[0].toString());
    //System.out.println(g[0].toString());
    // Observe Gafanhoto (linha 39) sobrescrevendo Pessoa (linha 56)
    // O comando super puxa os dados de Pessoa. Sem ele só aparecem os dados do Gafanhoto
    
    // Visualizações: combinações de vídeos e gafanhotos
    
    Visualizacao vis[] = new Visualizacao [5];
    
    vis[0]= new Visualizacao (g[0], v[0]); // Raimundo assiste Star Wars
    vis[0].avaliar(9);
    System.out.println(vis[0].toString()); // Star Wars nota 9
    
    vis[1]= new Visualizacao (g[0], v[1]); // Raimundo assite Shrek
    System.out.println(vis[1].toString());
    
    vis[2]= new Visualizacao (g[0], v[2]); // Raimundo assiste O Gangster
    System.out.println(vis[2].toString());
    
    vis[3]= new Visualizacao (g[1], v[0]); // Creusa assiste Star Wars
    vis[3].avaliar(8);
    System.out.println(vis[3].toString()); // Star Wars nota 7, média nota 8
    
    //c.play();
    //c.pause();
    //c.like();
    
    }
    
}
