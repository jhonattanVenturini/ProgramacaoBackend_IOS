
package Java;
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int totalAlunos = scanner.nextInt();

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("\nAluno " + i + ":");

            System.out.print("Nome do aluno: ");
            String nome = scanner.next();

            double somaNotas = 0;
            int quantidadeNotas = 3;

            for (int j = 1; j <= quantidadeNotas; j++) {
                System.out.print("Nota " + j + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / quantidadeNotas;
            System.out.printf("A média do aluno %s é: %.2f\n", nome, media);
        }

        scanner.close();
    }
}
