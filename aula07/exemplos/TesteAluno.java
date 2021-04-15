package exemplos;

import java.util.ArrayList;

public class TesteAluno {
    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        Aluno aluno1;

        aluno1 = new Aluno("Carlos", "119876-9876");
        lista.add(aluno1); 

        aluno1 = new Aluno("Rodrigo", "115555-7777");
        lista.add(aluno1); 

        lista.add(new Aluno("Renata", "113333-3333")); 

        lista.add(new Aluno("Daniela", "112222-2222")); 

        for (int i = 0; i < lista.size() ; i++) {
            System.out.print("posição: " + i + " ");
            System.out.println("conteúdo: " + lista.get(i));
        }
        
        for (Aluno aluno : lista) { //foreach -  para cada
            System.out.println("Aluno: " + aluno);
        }

        lista.remove(2);

        System.out.println(lista);

    }
}
