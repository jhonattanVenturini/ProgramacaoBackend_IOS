package Aula03_Operadores;

public class Operadores {
    public static void main(String[] args) {
        String nome = "Cleiton";
        int idade = 18;
        int anosTrabalho = 2;
        boolean temCarteira = true;
        boolean aprovado = false;

        if (idade >= 18 && temCarteira == true ) {
            System.out.println("Você pode dirigir!!😎");
        } else{
            System.out.println("Infelizmente você NÃO PODE!😡😡😡😡😡😡😡😡");
        }

        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Idade + Ano trabalho= " + (idade + anosTrabalho));
        System.out.println("Resto da divisão 10 % 3 = " + (10 % 3));
        System.out.println("É diferente de 5? " + (anosTrabalho != 5));
        System.out.println("Negação da aprovação: " + (!aprovado));
        System.out.println("------------------------------------------------");
        System.out.println();

    }
}
