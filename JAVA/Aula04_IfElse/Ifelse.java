package Aula04_IfElse;

import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Marcos";

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("VOCÊ É MAIOR DE IDADE!!!");
        } else if (idade >= 16) {
            System.out.println("VOCÊ É MENOR DE IDADE!!");
        } else {
            System.out.println("VOCÊ E PRÉ ADOLESCENTE!");
        }
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}
