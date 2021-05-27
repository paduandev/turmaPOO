package exemplos.exemplo03;

public interface Figura {
    
    default double perimetro(double... lados) {
        double res = 0;
        for (double d : lados) {
            res += d;
        }
        return res;
    }

}
