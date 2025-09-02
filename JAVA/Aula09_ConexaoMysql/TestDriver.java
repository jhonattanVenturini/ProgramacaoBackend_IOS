package Aula09_ConexaoMysql;

public class TestDriver {
    public static void main(String[] args) {
        try {
            // Tenta carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ Driver JDBC do MySQL carregado com sucesso!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver JDBC NÃO encontrado!");
            e.printStackTrace();
        }
    }
}
