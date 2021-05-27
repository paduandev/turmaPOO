package exemplos.exemplo02;

public interface Drawable {
    void draw();
    default void msg() {
        System.out.println("Método default");
    }
}
