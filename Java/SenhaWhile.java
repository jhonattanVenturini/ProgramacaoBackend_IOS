

// sistema aonde você coloca uma senha que aonde você digita "1234"
// se vc coloca errado ele vai tentando e seguindo até vc colocar  a senha certa!

package Java;
import java.util.Scanner;

public class SenhaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite a senha (1234): ");
            senha = sc.nextLine();
        } while (!senha.equals("1234"));

        System.out.println("Acesso permitido.");

        sc.close();
    }
}
