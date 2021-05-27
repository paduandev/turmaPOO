package exercicio;

public class App {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(5);
        Circulo c = new Circulo(5);

        System.out.println("Area do quadrado: " + q.getArea());
        System.out.println("Perímetro do quadrado: " + q.getPerimetro());
        System.out.println("Area do circulo: " + c.getArea());
        System.out.println("Perímetro do circulo: " + c.getPerimetro());
    }
}
