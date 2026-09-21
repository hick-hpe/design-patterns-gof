package src;
class MaterialDidaticoReal implements MaterialDidatico {

    private String nome;

    public MaterialDidaticoReal(String nome) {
        this.nome = nome;
    }

    @Override
    public void acessar() {
        System.out.println("Material acessado: " + nome);
    }
}