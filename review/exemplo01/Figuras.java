package exemplo01;

// interface = modelo, que define métodos obrigatorios para classes

public interface Figuras {
    String nome();

    default void exemplo() {
        System.out.println("Exemplo");
    }
}
