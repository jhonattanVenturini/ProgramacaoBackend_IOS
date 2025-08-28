package Aula06_For;

public class MediaSaldos {
  public static void main(String[] args) {
        
        // Criando um vetor com os saldos dos clientes
        double[] saldos = {1200.50, 500.00, 340.75, 8000.00, 150.30};

        double soma = 0;

        // Percorrendo todos os saldos com um laço for
        for(int i = 0; i < saldos.length; i++) {
            soma = soma + saldos[i];  // acumula os valores
        }

        // Calculando a média
        double media = soma / saldos.length;

        // Mostrando o resultado
        System.out.println("A média dos saldos é: " + media);
    }
}
