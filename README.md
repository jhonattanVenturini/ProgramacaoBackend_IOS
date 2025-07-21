
📘 Documentação do Curso: Desenvolvimento com Lógica, Java, PHP, MySQL e UML
🧠 1. Introdução
Este curso tem como objetivo introduzir os conceitos fundamentais da lógica de programação, orientando o aluno na construção de algoritmos, estruturas de controle e manipulação de dados. Em seguida, são apresentados os fundamentos das linguagens Java e PHP, integrando ao banco de dados MySQL. Também são abordados conceitos de modelagem utilizando UML com foco em diagramas de classes e casos de uso.

🎯 2. Objetivos Gerais
Desenvolver o raciocínio lógico aplicado à programação.

Implementar soluções utilizando Java e PHP.

Criar e gerenciar bancos de dados relacionais com MySQL.

Modelar sistemas utilizando diagramas UML (Casos de Uso e Classes).

Integrar backend com banco de dados em aplicações simples.

🧱 3. Estrutura do Curso
Módulo	Conteúdo	Carga Horária
1	Introdução à Lógica de Programação	10h
2	Algoritmos com Pseudocódigo e Portugol	8h
3	Fundamentos de Java	12h
4	Fundamentos de PHP	10h
5	Banco de Dados com MySQL	10h
6	Diagramas UML: Casos de Uso e Classes	8h
7	Projeto Integrador (CRUD Java + MySQL ou PHP + MySQL)	12h

🧮 4. Módulo 1: Lógica de Programação
Conteúdos:
Variáveis e tipos de dados

Operadores lógicos e aritméticos

Condicionais (if, else, switch)

Laços de repetição (while, for, do-while)

Vetores e matrizes

Funções e procedimentos

Exemplo:
portugol
Copiar
Editar
algoritmo "VerificaSenha"
var senha: caractere

inicio
   escreva("Digite a senha: ")
   leia(senha)

   se (senha = "1234") então
      escreval("Acesso permitido.")
   senao
      escreval("Senha incorreta.")
   fimse
fimalgoritmo
☕ 5. Módulo 2: Java Básico
Conteúdos:
Sintaxe básica

Classes, objetos e métodos

Entrada e saída de dados (Scanner)

Estruturas de controle

Orientação a Objetos (encapsulamento, herança, polimorfismo)

Exemplo:
java
Copiar
Editar
import java.util.Scanner;

public class VerificaSenha {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Digite a senha: ");
      String senha = input.nextLine();

      if (senha.equals("1234")) {
         System.out.println("Acesso permitido.");
      } else {
         System.out.println("Senha incorreta.");
      }
   }
}
🌐 6. Módulo 3: PHP Básico
Conteúdos:
Sintaxe básica

Variáveis e tipos

Condicionais e laços

Funções

Manipulação de formulários e dados

Exemplo:
php
Copiar
Editar
<?php
$senha = $_POST['senha'];

if ($senha == "1234") {
   echo "Acesso permitido.";
} else {
   echo "Senha incorreta.";
}
?>
🗃️ 7. Módulo 4: MySQL
Conteúdos:
Criação de banco de dados e tabelas

Tipos de dados

Comandos SQL (SELECT, INSERT, UPDATE, DELETE)

Relacionamentos entre tabelas

Consultas com JOIN

Exemplo:
sql
Copiar
Editar
CREATE TABLE usuarios (
   id INT AUTO_INCREMENT PRIMARY KEY,
   nome VARCHAR(100),
   email VARCHAR(100),
   senha VARCHAR(50)
);
🧩 8. Módulo 5: UML - Diagramas de Caso de Uso e Classes
Diagrama de Casos de Uso
Mostra as funcionalidades do sistema na visão do usuário (atores).

Exemplo: Sistema de Login

Atores: Usuário

Casos de uso: Login, Cadastrar, Recuperar Senha

Diagrama de Classes
Representa as classes do sistema, seus atributos, métodos e relacionamentos.

Exemplo:
arduino
Copiar
Editar
Classe: Usuario
+ id: int
+ nome: String
+ email: String
+ senha: String

+ autenticar(): boolean
+ cadastrar(): void
🛠️ 9. Módulo 6: Projeto Integrador
Descrição do Projeto:
Desenvolvimento de um sistema simples de cadastro de usuários com as seguintes funcionalidades:

Tela de Login

Cadastro de usuário

Listagem de usuários (CRUD)

Conexão com banco de dados MySQL

Tecnologias possíveis:

Backend em Java (JDBC) ou PHP

Banco de dados: MySQL

Interface simples com HTML/CSS

📋 10. Avaliação
Critério	Peso
Participação nas aulas	10%
Exercícios práticos	30%
Projeto Final	60%

📚 11. Recursos e Ferramentas Utilizadas
IDEs: Visual Studio Code, NetBeans ou Eclipse

Banco de dados: MySQL (com phpMyAdmin)

Ferramentas UML: draw.io, Lucidchart, StarUML

Navegador (para testar páginas PHP)

🏁 12. Conclusão
Ao final do curso, o aluno será capaz de:

Pensar algoritmicamente para resolver problemas.

Desenvolver aplicações simples com Java e PHP.

Modelar sistemas com UML.

Conectar linguagens backend com banco de dados.
