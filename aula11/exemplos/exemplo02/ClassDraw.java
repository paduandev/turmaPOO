package exemplos.exemplo02;

public class ClassDraw implements Drawable{
    @Override
    public void draw() {
        System.out.println("Draw...");
    }

    @Override
    public void msg() {
        System.out.println("Novo msg.");
    }
    
}
