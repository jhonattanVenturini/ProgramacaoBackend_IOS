package Aula03_Operadores;

public class Vip {
    public static void main(String[] args) {

        // convite 1 - normal 2- vip 3 - superVIp
        int idade = 18;
        boolean temConvite = true;
        int nivel = 3;
        int pontosBonus = nivel * 10 + idade % 10;
        boolean podeEntrar = (idade >= 18 && temConvite == true) || nivel >= 3;

        if (podeEntrar) {
            System.out.println("você pode entrar");
        } else{
            System.out.println("Acesso negado");
        }

        System.out.println("seus pontos são:" + pontosBonus);

    }
}
