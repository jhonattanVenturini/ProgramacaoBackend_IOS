
package Java.Aula05;
import java.util.Scanner;

public class teste {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero entre 1 e 2: ");
    int opcao = sc.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("Você escolheu a opção 1!");
        break;
      case 2:
        System.out.println("Você escolheu a opção 2!");
        break;
      default:
        System.out.println("Opção inválida!!!");
    }
    sc.close();
  }
}
