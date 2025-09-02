package Aula09_ConexaoMysql;
import java.sql.*;

public class InserirNoMySQL {
    public static void main(String[] args) {
        // Configuração do banco
        String url = "jdbc:mysql://localhost:3306/exemplo"; // banco exemplo
        String usuario = "root"; // seu usuário
        String senha = "jhow25@#";   // sua senha

        try {
            // Testa a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("✅ Conexão bem-sucedida com o MySQL!");

            // Fecha a conexão
            conexao.close();
        } catch (SQLException e) {
            System.out.println("❌ Erro na conexão: " + e.getMessage());
        }
    }
}
