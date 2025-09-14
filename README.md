# 📘 Projeto de Introdução à Programação em Java

Este repositório foi desenvolvido como material didático para uma **turma PCD (Pessoas com Deficiência)**, com o objetivo de **ensinar lógica de programação** utilizando a linguagem **Java**.

O curso aborda desde os **conceitos mais básicos** até a **Programação Orientada a Objetos (POO)**, passando por estruturas condicionais, loops, arrays, manipulação de dados e conexão com banco de dados MySQL.

---

## 🎯 Objetivo

O projeto tem como finalidade:

- Ensinar **lógica de programação** de forma prática.  
- Apresentar os **fundamentos da linguagem Java**.  
- Evoluir o aprendizado gradualmente até **Programação Orientada a Objetos (POO)**.  
- Aplicar conceitos de **persistência de dados com MySQL**.  
- Estimular a **autonomia de alunos PCD** na área de tecnologia.  

---

## 🛠️ Tecnologias Utilizadas

- **Java SE** (JDK 8 ou superior)  
- **MySQL** (para exemplos de conexão com banco de dados)  
- **Visual Studio Code** como editor e compilador principal  
  - 👉 Optamos por usar o **VS Code** para facilitar a configuração do ambiente e evitar a necessidade de instalar o **IntelliJ IDEA**, que poderia ser mais pesado e complexo para os alunos.  
- **Sistema Operacional**: Windows, Linux ou macOS  

---

## 📂 Estrutura do Projeto

```
Aula01_Introducao/
└── OlaMundo.java
Aula02_Tiposdedados/
└── TipoDado.java
Aula03_Operadores/
├── Operadores.java
└── Vip.java
Aula04_IfElse/
├── CadFilmes.java
├── Ifelse.java
├── LoginCad.java
└── LoginCadastro.java
Aula05_Switch/
└── Exemplo.java
Aula06_For/
├── Exemplofor.java
├── MediaSaldos.java
└── While.java
Aula07_Array/
├── SistemaC6Bank.java
└── teste.java
Aula08_POO/
└── POO.java
Aula09_ConexaoMysql/
├── InserirNoMySQL.java
└── TestDriver.java
.vscode/
```
---

📌 Cada pasta corresponde a uma **aula**, abordando um tema específico da linguagem Java.  

---

## ⚙️ Pré-requisitos

Antes de rodar o projeto localmente, certifique-se de ter:  

1. **Java JDK instalado**  
   - 👉 [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)  
   - Verifique a instalação:  
     ```bash
     java -version
     javac -version
     ```

2. **MySQL instalado** (apenas para **Aula 09 – Conexão com Banco de Dados**)  
   - 👉 [Download MySQL](https://dev.mysql.com/downloads/)  
   - Configurar usuário e senha no código (`InserirNoMySQL.java`).  

3. **Visual Studio Code com extensões recomendadas**  
   - Extension Pack for Java  
   - MySQL  

---

## ▶️ Como executar
1. **Clone este repositório**  
```
bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```
---
2.**Compile um arquivo .java específico**
```
javac Aula01_Introducao/OlaMundo.java
```
---
3.**Execute o programa**
 ```
 java Aula01_Introducao.OlaMundo
 ```
4.**Para os exemplos com MySQL, configure o banco no seu ambiente e execute:**
 ```
javac Aula09_ConexaoMysql/TestDriver.java
java Aula09_ConexaoMysql.TestDriver
 ```
## 👥 Público-alvo  

Este projeto foi desenvolvido especialmente para **turmas PCD (Pessoas com Deficiência)**, promovendo **acessibilidade, inclusão digital e autonomia** no aprendizado de programação e tecnologia.  

---

## 🚀 Possíveis Melhorias Futuras  

Para tornar o projeto ainda mais completo e acessível, no futuro podemos adicionar:  

- 🔊 **Recursos de acessibilidade avançados** (integração com leitores de tela, legendas automáticas e saídas de áudio).  
- 🌐 **Exemplos práticos com aplicações web** desenvolvidas em Java.  
- 📱 **Integração com desenvolvimento mobile** (Android).  
- 🗄️ **Expansão no uso de banco de dados**, com consultas mais complexas e uso de ORM (Hibernate).  
- 🎮 **Projetos práticos e interativos** (jogos simples e sistemas de cadastro mais robustos).  
- 📖 **Material de apoio complementar**, como apostilas digitais, roteiros de estudo e videoaulas.  










