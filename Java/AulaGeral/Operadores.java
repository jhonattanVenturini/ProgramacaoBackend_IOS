package Java.AulaGeral;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Credenciais fixas
        String usuarioCorreto = "admin";
        String senhaCorreta = "123";

        System.out.print("Digite o usuário: ");
        String usuarioDigitado = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();

        // Validação de login
        if (usuarioDigitado == usuarioCorreto && senhaDigitada == senhaCorreta) {
            System.out.println("\n✅ Login bem-sucedido!\n");

            // Cadastro de 5 filmes
            System.out.println("🎬 Cadastro de 5 Filmes\n");

            System.out.print("Digite o título do 1º filme: ");
            String titulo1 = sc.nextLine();
            System.out.print("Digite o ano do 1º filme: ");
            int ano1 = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o gênero do 1º filme: ");
            String genero1 = sc.nextLine();

            System.out.print("\nDigite o título do 2º filme: ");
            String titulo2 = sc.nextLine();
            System.out.print("Digite o ano do 2º filme: ");
            int ano2 = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o gênero do 2º filme: ");
            String genero2 = sc.nextLine();

            System.out.print("\nDigite o título do 3º filme: ");
            String titulo3 = sc.nextLine();
            System.out.print("Digite o ano do 3º filme: ");
            int ano3 = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o gênero do 3º filme: ");
            String genero3 = sc.nextLine();

            System.out.print("\nDigite o título do 4º filme: ");
            String titulo4 = sc.nextLine();
            System.out.print("Digite o ano do 4º filme: ");
            int ano4 = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o gênero do 4º filme: ");
            String genero4 = sc.nextLine();

            System.out.print("\nDigite o título do 5º filme: ");
            String titulo5 = sc.nextLine();
            System.out.print("Digite o ano do 5º filme: ");
            int ano5 = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o gênero do 5º filme: ");
            String genero5 = sc.nextLine();

            // Menu de consulta
            System.out.println("\n📋 Menu de Consulta");
            System.out.println("Digite 1 para ver os filmes cadastrados:");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("\n===============================");
                System.out.println("📽️ FILMES CADASTRADOS NO SISTEMA");
                System.out.println("===============================\n");

                System.out.println("1️⃣ " + titulo1 + " (" + ano1 + ") - " + genero1);
                System.out.println("2️⃣ " + titulo2 + " (" + ano2 + ") - " + genero2);
                System.out.println("3️⃣ " + titulo3 + " (" + ano3 + ") - " + genero3);
                System.out.println("4️⃣ " + titulo4 + " (" + ano4 + ") - " + genero4);
                System.out.println("5️⃣ " + titulo5 + " (" + ano5 + ") - " + genero5);

                System.out.println("\n===============================");
                System.out.println("✅ Consulta finalizada!");
                System.out.println("===============================");
            } else {
                System.out.println("⚠️ Opção inválida! Tente novamente.");
            }

        } else {
            System.out.println("❌ Usuário ou senha incorretos!");
        }

        sc.close();
    }
}
