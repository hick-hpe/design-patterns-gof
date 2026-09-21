package src;
class ProxyMaterialDidatico implements MaterialDidatico {

    private MaterialDidaticoReal materialReal;
    private boolean autorizado;

    public ProxyMaterialDidatico(boolean autorizado) {
        this.autorizado = autorizado;
    }

    @Override
    public void acessar() {

        if (!autorizado) {
            System.out.println("Acesso negado ao material.");
            return;
        }

        if (materialReal == null) {
            materialReal = new MaterialDidaticoReal(
                "Material de Padrões de Projeto"
            );
        }

        materialReal.acessar();
    }
}