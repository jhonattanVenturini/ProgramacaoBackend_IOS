package Aula07_Array;
import java.util.Scanner;

public class SistemaC6Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usuarioPadrao = "admin";
        String senhaPadrao = "1234"; // senha normal sem criptografia

        int tentativas = 0;
        boolean acessoLiberado = false;

        String cliente = "ClienteTeste";
        double saldo = 1000.0;
        String[] transacoes = new String[100];
        int totalTransacoes = 0;

        // LOGIN
        while(tentativas < 3 && !acessoLiberado) {
            System.out.println("\n===================================================");
            System.out.println("                   SISTEMA LOGIN                  ");
            System.out.println("===================================================");
            System.out.print("Usuário: ");
            String usuario = input.nextLine();
            System.out.print("Senha: ");
            String senha = input.nextLine();
            System.out.println("===================================================");

            if(usuario.equals(usuarioPadrao) && senha.equals(senhaPadrao)) {
                System.out.println("Login realizado com sucesso!");
                System.out.println("Bem-vindo ao C6 Bank, " + cliente + "!");
                acessoLiberado = true;
            } else {
                tentativas++;
                System.out.println("Usuário ou senha incorretos! Tentativa " + tentativas + " de 3.");
            }
        }

        if(!acessoLiberado) {
            System.out.println("Acesso bloqueado! Contate o administrador.");
            input.close();
            return;
        }

        // MENU
        int opcao;
        do {
            System.out.println("\n===================================================");
            System.out.println("                     MENU PRINCIPAL               ");
            System.out.println("===================================================");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar transações do mês");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine(); // limpar buffer

            switch(opcao) {
                case 1: // Consultar saldo
                    System.out.println("\n--- CONSULTA DE SALDO ---");
                    System.out.println("Cliente: " + cliente);
                    System.out.println("Conta: 0001-01");
                    System.out.println("Saldo atual: R$" + saldo);
                    System.out.println("-------------------------");
                    break;

                case 2: // Consultar transações
                    System.out.println("\n--- HISTÓRICO DE TRANSAÇÕES ---");
                    if(totalTransacoes == 0) {
                        System.out.println("Nenhuma transação realizada.");
                    } else {
                        for(int i = 0; i < totalTransacoes; i++) {
                            System.out.println((i+1) + ". " + transacoes[i]);
                        }
                    }
                    System.out.println("-------------------------------");
                    break;

                case 3: // Depositar
                    System.out.println("\n--- DEPÓSITO ---");
                    System.out.print("Digite o valor do depósito: R$");
                    double valorDep = input.nextDouble();
                    if(valorDep > 0) {
                        saldo += valorDep;
                        transacoes[totalTransacoes] = "Depósito: R$" + valorDep;
                        totalTransacoes++;
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println("-------------------------------");
                        System.out.println("Valor depositado: R$" + valorDep);
                        System.out.println("Saldo atual: R$" + saldo);
                        System.out.println("-------------------------------");
                    } else {
                        System.out.println("Valor inválido! Operação cancelada.");
                    }
                    break;

                case 4: // Sacar
                    System.out.println("\n--- SAQUE ---");
                    System.out.print("Digite o valor do saque: R$");
                    double valorSaque = input.nextDouble();
                    if(valorSaque > 0 && valorSaque <= saldo) {
                        saldo -= valorSaque;
                        transacoes[totalTransacoes] = "Saque: R$" + valorSaque;
                        totalTransacoes++;
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("-------------------------------");
                        System.out.println("Valor sacado: R$" + valorSaque);
                        System.out.println("Saldo atual: R$" + saldo);
                        System.out.println("-------------------------------");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido! Operação cancelada.");
                    }
                    break;

                case 5: // Sair
                    System.out.println("Saindo do sistema... Obrigado por usar o C6 Bank!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while(opcao != 5);

        input.close();
    }
}
