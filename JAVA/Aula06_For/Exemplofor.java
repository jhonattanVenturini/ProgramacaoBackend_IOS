package Aula06_For;

import java.util.Scanner;
public class Exemplofor {
    // execução inicial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userCorreto = "admin";
        String senhaCorreto = "123";

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a sua usuario :");
            String userDigitado = sc.nextLine();

            System.out.println("Digite a sua senha:");
            String senhaDigitada = sc.nextLine();
            
            if (userDigitado.equals(userCorreto) && senhaDigitada.equals(senhaCorreto)) {
                System.out.println("Você está logado!");
                break; 
            } else {
                System.out.println("Você tem tentativa:"+ i+ " de 3");
            } 
        }
        sc.close();
    }

}
