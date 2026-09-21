package strategy.src;

class MediaPonderada implements CalculoNota {

    @Override
    public double calcular(double nota1, double nota2) {
        return (nota1 * 0.4) + (nota2 * 0.6);
    }
}