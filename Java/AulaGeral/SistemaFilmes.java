package Java.AulaGeral;
import java.util.Scanner;

public class SistemaFilmes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("     🎬 SISTEMA DE CADASTRO DE FILMES   ");
        System.out.println("=======================================\n");

        
        // Credenciais de acesso
        String usuarioCorreto = "admin";
        String senhaCorreta = "123";

        // Tela de login
        System.out.print("Usuário: ");
        String usuarioDigitado = sc.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = sc.nextLine();

        // Validação do login
        if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("\n✅ Login bem-sucedido!\n");

            // Cadastro de 5 filmes
            String[] titulos = new String[5];
            int[] anos = new int[5];
            String[] generos = new String[5];

            for (int i = 0; i < 5; i++) {
                System.out.println("Cadastro do " + (i + 1) + "º filme:");
                System.out.print("Título: ");
                titulos[i] = sc.nextLine();
                System.out.print("Ano de lançamento: ");
                anos[i] = sc.nextInt();
                sc.nextLine(); // Limpa buffer
                System.out.print("Gênero: ");
                generos[i] = sc.nextLine();
                System.out.println("-----------------------------");
            }

            // Menu de consulta
            System.out.println("\n📋 CONSULTA DE FILMES");
            System.out.print("Digite o número do filme que deseja ver (1 a 5): ");
            int opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 5) {
                int index = opcao - 1; // Ajusta índice do array
                System.out.println("\n===============================");
                System.out.println("🎬 FILME SELECIONADO");
                System.out.println("===============================\n");
                System.out.println("Título: " + titulos[index]);
                System.out.println("Ano: " + anos[index]);
                System.out.println("Gênero: " + generos[index]);
                System.out.println("\n✅ Consulta finalizada!");
            } else {
                System.out.println("\n⚠️ Opção inválida! Por favor, digite um número de 1 a 5.");
            }

        } else {
            System.out.println("\n❌ Usuário ou senha incorretos!");
        }

        sc.close();
    }
}
