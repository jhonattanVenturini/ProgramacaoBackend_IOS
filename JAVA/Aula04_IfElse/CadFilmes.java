package Aula04_IfElse;

import java.util.Scanner;
public class CadFilmes {
    public static void main(String[] args) {
        String logC = "ADMIN";
        String senhaC = "123";
        Scanner sc = new Scanner(System.in);

        // Digita os dados de acesso:
        System.out.println("Digite o seu usuário:");
        String logE = sc.nextLine();

        System.out.println("Digite a sua senha:");
        String senhaE = sc.nextLine();

        // Comparação correta dos dados
        if (logE.equals(logC) && senhaE.equals(senhaC)) {
            System.out.println("Sim, você está liberado!");
        } else {
            System.out.println("O seu usuário ou senha está INCORRETO!!!");
            System.out.println();
            System.out.println("ERROOOOOO........");
        }

        // FILME 01
        System.out.println("Digite o titulo do filme1");
        String titulo2 = sc.nextLine();

        System.out.println("Digite o Ano de ");
        String titulo1 = sc.nextLine();

        //

        sc.close(); // Boa prática: fechar o Scanner
    }

}
