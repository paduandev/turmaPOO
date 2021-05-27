package exercicio;

public class Circulo implements FiguraGeometrica{
    private final double PI = 3.1415;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigura() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * PI * raio;
    }
    
}
