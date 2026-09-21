
/**
 * ExemploProxy
 */  

public class ExemploProxy {
    public static void main(String[] args) {

        // tentando acessar o arquivo sem autorização
        Arquivo arquivo = new ProxyArquivo(false);
        arquivo.acessar();

        // tentando acessar o arquivo com autorização
        arquivo = new ProxyArquivo(true);
        arquivo.acessar();
    }

}
