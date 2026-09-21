package strategy.src;

public class Main {

    public static void main(String[] args) {

        CalculadoraNota calculadoraSimples =
            new CalculadoraNota(new MediaSimples());

        double notaSimples = calculadoraSimples.calcularNota(8, 10);

        System.out.println("Média simples: " + notaSimples);


        CalculadoraNota calculadoraPonderada =
            new CalculadoraNota(new MediaPonderada());

        double notaPonderada = calculadoraPonderada.calcularNota(8, 10);

        System.out.println("Média ponderada: " + notaPonderada);
    }
}