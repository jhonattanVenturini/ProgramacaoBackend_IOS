// package - referencia a pasta
// Aula04_Ifelse - pasta que ele refeencia
// ; sempre pra final da expressão
// public - compartilhar o codigo
// class - com o mesmo nome do meu arquivo

package Aula04_IfElse;
import java.util.Scanner;

public class LoginCad {
    // main - inicia a minha execução apartir dessa linha 
    public static void main(String[] args) {
        // Funciona como o leia 
        Scanner sc = new Scanner(System.in);

        // criar as minhas variaveis
        String userCorreta = "admin";
        String senhaCorreta = "senha123";

        // scanner e leia aquilo que o usuario digitou(user) 
        System.out.println("Digite o seu usuario: ");
        String userDigitada = sc.nextLine();

        // scanner e leia aquilo que o usuario digitou(senha)
        System.out.println("Digite a sua senha: ");
        String senhaDigitada = sc.nextLine();

        // estrutura de decisão de login
        if (userDigitada.equals(userCorreta) && senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Você pode entrar!");
        } else {
            System.out.println("Você não pode entrar!! Erro.....");
        }
    }
    
}

