import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    private ArrayList<Aluno> alunos;
    private Scanner scanner;

    public Turma() {
        alunos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void adicionarAluno() {
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        scanner.nextLine();

        Aluno aluno = new Aluno(matricula, nota);
        alunos.add(aluno);
    }

    public void exibirAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Dados dos alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Exibir alunos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    exibirAlunos();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Erro.");
                    break;
            }
        }
    }
}

