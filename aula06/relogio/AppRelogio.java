package relogio;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(5, 23, 45);

        /*
         * relogio.hora = -21; relogio.minuto = 987686; relogio.segundo = 1;
         */

        System.out.println("Hora atual: " + relogio.getHora());
        System.out.println("Minuto atual: " + relogio.getMinuto());
        System.out.println("Segundo atual: " + relogio.getSegundo());

        relogio.setHora(-6);
        relogio.exibir();
    }

}
