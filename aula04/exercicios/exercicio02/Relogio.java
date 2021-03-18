package exercicios.exercicio02;

public class Relogio {
    int hora, minuto, segundo;

    void exibir() {
        // System.out.println(hora + ":" + minuto + ":" + segundo);
        //printf(FORMATO, VARIÁVEIS)
        // %d = inteiro, %f - casa decimal
        //%2d = 2 casas
        // %02d = 2 casas e preenche com zero à esquerda
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
 }
