class ProxyArquivo implements Arquivo {

    private ArquivoReal arquivoReal;
    private boolean autorizado;

    public ProxyArquivo(boolean autorizado) {
        this.autorizado = autorizado;
    }

    @Override
    public void acessar() {

        if (!autorizado) {
            System.out.println("Acesso negado.");
            return;
        }

        if (arquivoReal == null) {
            arquivoReal = new ArquivoReal();
        }

        arquivoReal.acessar();
    }
}