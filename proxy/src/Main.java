package src;
public class Main {

    public static void main(String[] args) {

        MaterialDidatico material = new ProxyMaterialDidatico(false);
        material.acessar();

        System.out.println();

        material = new ProxyMaterialDidatico(true);
        material.acessar();
    }
}