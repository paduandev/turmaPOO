package exemplos.exemplo01;

public class Escrita implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show(){
        System.out.println("Boa noite!");
    }
}
