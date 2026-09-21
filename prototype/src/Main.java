package prototype.src;

public class Main {

    public static void main(String[] args) {

        PlanoAula planoOriginal = new PlanoAula(
            "Programação Orientada a Objetos",
            "Padrão de projeto Prototype",
            2,
            "Aula prática"
        );

        PlanoAula planoClonado = planoOriginal.clone();

        planoClonado.setDisciplina("Engenharia de Software");

        System.out.println("Plano original:");
        System.out.println(planoOriginal);

        System.out.println("\nPlano clonado:");
        System.out.println(planoClonado);
    }
}