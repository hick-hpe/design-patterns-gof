package prototype.src;

/**
 * 
 * PlanoAula
 * 
 * Permite que o método `clone()` faça uma cópia campo a campo de instâncias dessa classe.
 */
class PlanoAula implements Cloneable {
    private String disciplina;
    private String conteudo;
    private int duracao;
    private String metodologia;

    public PlanoAula(String disciplina, String conteudo, int duracao, String metodologia) {
        this.disciplina = disciplina;
        this.conteudo = conteudo;
        this.duracao = duracao;
        this.metodologia = metodologia;
    }

    @Override
    public PlanoAula clone() {
        try {
            return (PlanoAula) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Disciplina: " + disciplina +
               ", Conteúdo: " + conteudo +
               ", Duração: " + duracao + "h" +
               ", Metodologia: " + metodologia;
    }
}