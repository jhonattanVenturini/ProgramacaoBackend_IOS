package Aula05_Switch;

import java.util.Scanner;

public class Exemplo {
    // linha para ele executar o programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo! Escolha um dos lanches abaixo:");
        System.out.println("1 - X-Salada, 2 X-Bacon, 3 X-Bacon&Ovo , 4 -X-tudo(Podrão)");

        System.out.println("Digite uma opção de lanche:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Olá você escolheu a opção 1, seu lanche é X- salada");
                break;
            case 2:
                System.out.println("Olá você escolheu a opção 2,seu lanche é X-Bacon");
                break;
            case 3:
                System.out.println("Olá você escolheu a opção 3,seu lanche é X-Bacon&Ovo");
                break;
            case 4:
                System.out.println("Olá você escolheu a opção 4,seu lanche é X-tudo(Podrão) ");
                break;

            case 5:
                System.out.println("hahahahaha");
                break;
            default:
                System.out.println("Opção Invalida!");

        }
        sc.close();
    }
}
