package Aula07_Array;
import java.util.Scanner;

public class teste {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String userCorreto = "admin";
    String senhaCorreto = "1234";
    int tentativas = 0;

    System.out.println("===================================================");
    System.out.println("          Sistema de Login - Banco C6 Bank          ");
    System.out.println("===================================================");

    while (tentativas < 3) {
      System.out.print("Usuário: ");
      String userDigitado = sc.nextLine();

      System.out.print("Senha: ");
      String senhaDigitado = sc.nextLine();

      if (userDigitado.equals(userCorreto) && senhaDigitado.equals(senhaCorreto)) {
        System.out.println("===================================================");
        System.out.println("Login realizado com sucesso!");
        System.out.println("Bem-vindo(a) ao Banco C6 Bank!");
        System.out.println("===================================================");
        break; // <- se acertar, sai do loop imediatamente
      } else {
        tentativas++;
        System.out.println("===================================================");
        System.out.println("Usuário ou senha incorretos.");
        System.out.println("Tentativas restantes: " + (3 - tentativas));
        System.out.println("===================================================");
      }
    }

    if (tentativas == 3) {
      System.out.println("===================================================");
      System.out.println("Conta bloqueada! Tente novamente mais tarde.");
      System.out.println("===================================================");
    }

    sc.close();
  }
}
