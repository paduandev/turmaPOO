package exemplos;

import java.util.ArrayList;

public class GerenciaAluno {
    private ArrayList<Aluno> lista;

    public GerenciaAluno(){
        lista = new ArrayList<>();
    }

    public void novoAluno(String nome, String telefone){
        lista.add(new Aluno(nome, telefone));
    }

    public String exibirTodos(){
        return "Alunos: " + lista;
    }

    public void apagarAluno(String nome){
        for (Aluno aluno : lista) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                lista.remove(aluno);
                return;
            }
        }
    }

    public void alterarTelefone(String nome, String telefone){
        for (Aluno aluno : lista) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                aluno.setTelefone(telefone);
                return;
            }
        }
    }
}
