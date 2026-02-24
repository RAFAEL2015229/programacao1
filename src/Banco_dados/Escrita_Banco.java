package Banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Escrita_Banco {

    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "Rafael2015.@";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucao_insert = "INSERT INTO pessoa (id, nome) VALUES (?, ?)";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement statement = conexao.prepareStatement(instrucao_insert);
            statement.setInt(1, 30);
            statement.setString(2, "João");

            statement.executeUpdate();

            System.out.println("Inclusao Realizada com Sucesso!");

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

}
