package exercicios.exercicio02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        relogio.hora = 21;
        relogio.minuto = 4;
        relogio.segundo = 1;

        relogio.exibir();
    }
}
