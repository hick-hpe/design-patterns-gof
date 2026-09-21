package strategy.src;

class CalculadoraNota {

    private CalculoNota estrategia;

    public CalculadoraNota(CalculoNota estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularNota(double nota1, double nota2) {
        return estrategia.calcular(nota1, nota2);
    }
}