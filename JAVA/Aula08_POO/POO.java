package Aula08_POO;

class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("=================================");
        System.out.println("   👤 Apresentação da Pessoa");
        System.out.println("=================================");
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
        System.out.println("=================================\n");
    }
}

public class POO {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Maria";
        p1.idade = 22;

        Pessoa p2 = new Pessoa();
        p2.nome = "João";
        p2.idade = 30;

        // Chamando os métodos
        p1.apresentar();
        p2.apresentar();
    }
}
