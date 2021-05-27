package exercicio;

public class Quadrado implements FiguraGeometrica {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado"; // Quadrado.class.getSimpleName();
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }
    
}
