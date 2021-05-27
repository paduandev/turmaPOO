package exemplos.exemplo03;

public class Quadrado implements Figura {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double getPerimetro() {
        return perimetro(lado, lado);
    }
}
