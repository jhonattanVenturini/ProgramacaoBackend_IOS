package Java;
import java.util.Scanner;

public class SomaComEntrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Criar objeto para ler dados

        System.out.print("Digite o primeiro número: ");
        int numero1 = teclado.nextInt(); // Lê um número inteiro

        System.out.print("Digite o segundo número: ");
        int numero2 = teclado.nextInt(); // Lê outro número inteiro

        int soma = numero1 + numero2; // Faz a soma

        System.out.println("A soma é: " + soma); // Mostra o resultado

        teclado.close(); // Fecha o Scanner
    }
}
