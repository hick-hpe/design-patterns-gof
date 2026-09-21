package prototype;

/**
 * ExemploPrototype
 * 
 */
public class ExemploPrototype {
    public static void main(String[] args) {

        // criando o primeiro personagem
        Personagem guerreiro = new Personagem(
            "Guerreiro",
            100,
            80,
            "Espada"
        );

        // clonando o personagem criado
        Personagem outroGuerreiro = guerreiro.clone();

        // alternado o nome do novo personagem
        outroGuerreiro.setNome("Guerreiro 2");

        System.out.println(guerreiro);
        System.out.println(outroGuerreiro);
    }
}    
