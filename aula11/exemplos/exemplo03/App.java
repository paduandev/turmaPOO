package exemplos.exemplo03;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Quadrado(12));
        figuras.add(new Quadrado(11.5));
        figuras.add(new Triangulo(12, 13, 14));
        figuras.add(new Triangulo(2, 3, 4));

/*         System.out.println(figuras.get(0).perimetro(((Quadrado) figuras.get(0)).getLado()));
        System.out.println(figuras.get(0).perimetro(11.5, 11.5));
        System.out.println(figuras.get(0).getPerimetro()); */

        for (Figura figura : figuras) {
            System.out.println("Perímetro: " + figura.getPerimetro());
        }
    }
}
