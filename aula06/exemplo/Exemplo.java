package exemplo;

public class Exemplo {

    public enum Turno {
        MANHA, TARDE, NOITE
    }

    public static void main(String[] args) {
        Turno periodoDoCurso;

        periodoDoCurso = Turno.MANHA;

        switch (periodoDoCurso) {
            case MANHA:
                System.out.println("Manhã");
                break;
            case TARDE:
                System.out.println("Tarde");
                break;
            case NOITE:
                System.out.println("Noite");
                break;
            default:
                break;
        }
    }

}
