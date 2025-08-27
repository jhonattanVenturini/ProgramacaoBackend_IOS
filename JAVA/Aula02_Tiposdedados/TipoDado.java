package Aula02_Tiposdedados;

public class TipoDado {
    public static void main(String[] args) {
        // deteminando as variaveis 
        String nome = "Gabryel";
        int idade = 24;
        int nota1 = 10;
        int nota2 = 7;

        // calculo da media das variaveis 
        int media = (nota1 + nota2 ) /2;


            // como descobrir a media

          if (media >= 7 ) {
            System.out.println("Você tá aprovado!");
          } else{
            System.out.println("Você tá reprovado!");
          }
          System.out.println("Olá,"+ nome + " você tem: " + idade + "A sua nota é:" + media );  
    } 
}