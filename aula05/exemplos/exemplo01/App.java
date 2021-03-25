package exemplos.exemplo01;


public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 2000);
        Pessoa p2 = new Pessoa("Amanda", 3000);

        Pessoa p3 = new Pessoa();

        p1.exibir();
        p2.exibir();
        p3.exibir();
        
    }

}
