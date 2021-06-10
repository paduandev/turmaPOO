package exemplo02;

public class AppCalcula {
    public static void main(String[] args) {
        double resp;
        int div = 7;

        resp = (double) Calcula.soma(10, 20) / div;

        System.out.println("Resutlado = " + resp);

        Calcula c1 = new Calcula();
        // Calcula c2 = new Calcula();

/*         c1.valor = 10;
        c2.valor = 20; */
        Calcula.setValor(12);

        System.out.println("c1 = " + Calcula.getValor());
        // System.out.println("c2 = " + c2.valor);

        System.out.println(c1);

    }
}
