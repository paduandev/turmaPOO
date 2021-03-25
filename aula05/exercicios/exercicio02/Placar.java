package exercicios.exercicio02;

public class Placar {
    String time1, time2;
    int gols1, gols2;

    public Placar() {
        this("Time da casa", "Visitante", 0, 0); // chamada ao construtor
    }

    public Placar(String time1, String time2) {
        this(time1, time2, 0, 0);
    }

    public Placar(String time1, String time2, int gols1, int gols2) {
        this.time1 = time1;
        this.time2 = time2;
        this.gols1 = gols1;
        this.gols2 = gols2;
    }

    public String toString() {
        return (time1 + " " + gols1 + " X " + gols2 + " " + time2);
    }

}
