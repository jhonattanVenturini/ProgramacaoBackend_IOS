package Java;
import java.util.Scanner;

public class LoginSimples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usuario, senha;

        System.out.println("----------------------------------------------");
        System.out.println("Escreva o nome do seu usuário:");
        usuario = input.nextLine();

        System.out.println("----------------------------------------------");
        System.out.println("Escreva a sua senha:");
        senha = input.nextLine();

        System.out.println("----------------------------------------------");

        if (usuario.equals("jhon") && senha.equals("1234")) {
            System.out.println("Parabéns! O seu acesso está liberado.");
            System.out.println("----------------------------------------------");
        } else {
            System.out.println("Acesso NEGADO! USUÁRIO OU SENHA INCORRETOS.");
            System.out.println("ERRO, ERRO, ERROOOOOO...................");
        }

        input.close();
    }
}
