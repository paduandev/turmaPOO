package exemplo01;

import java.util.ArrayList;

public class AppFiguras {
    public static void main(String[] args) {
        ArrayList<Figuras> lista = new ArrayList<>();

        // Figuras f = new Triangulo();
/*         Triangulo t = new Triangulo();

        Figuras f = t;

        t = (Triangulo) f; */

        lista.add(new Quadrado());
        lista.add(new Quadrado());
        lista.add(new Triangulo());

        for (Figuras fig : lista) {
            System.out.println(fig.nome());
        }

        lista.get(0).exemplo();
    }
}
