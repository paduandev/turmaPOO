package robo;

public class AppRobo {
    public static void main(String[] args) {
        Robo robo = new Robo(2, 3, 100, -100);

        for (int i = 0; i < 10; i++) {
            robo.moverNorte();
        }
        System.out.println(robo);
    }
}
