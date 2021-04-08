package calculadora;

public class Calculadora {
    private double numero1, numero2;
    private char operador;

    public Calculadora() {
        operador = ' ';
    }

    public double somar(double valor1, double valor2) {
        numero1 = valor1;
        numero2 = valor2;
        operador = '+';
        return numero1 + numero2;
    }

    public String exibir() {
        double resultado;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
        
            default:
                resultado = 0;
                break;
        }
        return numero1 + " " + operador +  " " + numero2 + " = " + resultado;
    } 
}
