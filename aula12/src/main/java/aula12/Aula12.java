package aula12;
public class Aula12 {
    public static void main(String[] args) {
    // CÓDIGO PRINCIPAL - POLIMORFISMO DE SOBRESCRIÇÃO
       
    // Classes e Instanciamentos Iniciais 
    // Animal a = new Animal (); // Dá erro! Clasee abstrata de Primeiro Nível.
    // Superclasse não pode ser instanciada!
    Mamifero m = new Mamifero();
    Reptil r = new Reptil();
    Peixe p = new Peixe();
    Ave a = new Ave();
    
    // Instanciamentos Específicos do Segundo Nível
    m.setPeso(85.3f);
    m.setIdade(1);
    //m.setMembros(4);
    //m.setCorPelo("Marrom");
    
    // Instanciamentos de Terceiro Nível
    Canguru c = new Canguru();
    Cachorro k = new Cachorro();
    Cobra j = new Cobra();
    Tartaruga t = new Tartaruga();
    Goldfish g = new Goldfish();
    Arara e = new Arara();
    
    // Testes e Simulações
    j.locomover();
    c.locomover(); // Sobrescreve o "Correndo" de mamifero por "Saltando" / Polimorfismo de Sobrescrição
    c.emitirSom();
    k.emitirSom(); // Sobrescreve o "Som de mamifero" por "Latir" / Polimorfismo de Sobrescrição
    
    }
}
