package exemplo01;

public class Quadrado implements Figuras {
    
    @Override
    public String nome() {
        return "Quadrado";
    }

    @Override
    public void exemplo() {
        System.out.println("override...");;
    }
}
