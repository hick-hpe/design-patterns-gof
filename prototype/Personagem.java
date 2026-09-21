package prototype;

/**
 * 
 * Personagem
 * 
 * Permite que o método `clone()` faça uma cópia campo a campo de instâncias dessa classe.
 */
class Personagem implements Cloneable {
    private String nome;
    private int vida;
    private int forca;
    private String arma;

    public Personagem(String nome, int vida, int forca, String arma) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.arma = arma;
    }

    @Override
    public Personagem clone() {
        try {
            return (Personagem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               ", Vida: " + vida +
               ", Força: " + forca +
               ", Arma: " + arma;
    }
}