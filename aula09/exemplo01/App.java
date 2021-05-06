
public class App {

    public static void main(String[] args) {
        Metodos metodos1 = new Metodos();
        Metodos metodos2 = new Metodos();

        // int resp = Metodos.soma(10, 5);
        // metodos1.getX();
       // System.out.println(resp);

        System.out.println(Metodos.getComum());

        Metodos.setComum(12);

        System.out.println(Metodos.getComum());

    }
}