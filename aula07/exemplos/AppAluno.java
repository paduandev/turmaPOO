package exemplos;

import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        GerenciaAluno alunos = new GerenciaAluno();
        Scanner teclado = new Scanner(System.in);
        int menu;
        String nome, telefone;

        do {
            System.out.println("\n1-novo aluno");
            System.out.println("2-remover aluno");
            System.out.println("3-alterar telefone");
            System.out.println("4-listar todos");
            System.out.println("5-sair");
            menu = Integer.parseInt(teclado.nextLine());

            switch (menu) {
            case 1:
                System.out.println("Informe o nome:");
                nome = teclado.nextLine();
                System.out.println("Informe o telefone");
                telefone = teclado.nextLine();
                alunos.novoAluno(nome, telefone);
                break;

            case 2:
                System.out.println(alunos.exibirTodos());
                System.out.println("Digite o nome que será apagado?");
                nome = teclado.nextLine();
                alunos.apagarAluno(nome);
                break;

            case 3:
                System.out.println(alunos.exibirTodos());
                System.out.println("Digite o nome que será apagado?");
                nome = teclado.nextLine();
                System.out.println("Qual o novo telefone:");
                telefone = teclado.nextLine();
                alunos.alterarTelefone(nome, telefone);
                break;

            case 4:
                System.out.println(alunos.exibirTodos());
                break;

            case 5:
                break;

            default:
                System.out.println("Opção inválida.\n");
                break;
            }

        } while (menu != 5);

        teclado.close();
    }
}
