
// sistema que você coloca a senha usando uma estruturade de decisão, if e else 
// primeiro vc coloca a senha e ele permite o acesso caso não vc terá senha negada

package Java;
import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine(); // Lê a senha digitada

        if (senha.equals("1234")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Senha incorreta.");
        }

        scanner.close();
    }
}
