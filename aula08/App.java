import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Carlos", "11 98765432", "Direito");
        Professor professor = new Professor("Giacomine", "11 99998888", 3000);

        // Pessoa pessoa = new Pessoa("A", "T");
        Pessoa pessoa;

        pessoa = professor;

        professor = (Professor) pessoa;

        System.out.println(pessoa.exibir()); // Polimorfismo

        // System.out.println(p);

        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(new Estudante("E1", "T1", "C1"));
        lista.add(new Professor("P1", "T2", 1000));
        lista.add(new Estudante("E2", "T3", "C2"));
        lista.add(new Professor("P2", "T4", 2000));

        for (Pessoa p : lista) {
            System.out.println(p.exibir());
        }

    }
}
