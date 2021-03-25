package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Santos", "Palmeiras");
        Placar p3 = new Placar("Santos", "Palmeiras", 1, 2);

        System.out.println( p1 );
        System.out.println( p2.toString() );
        System.out.println( p3.toString() );
    }

}
