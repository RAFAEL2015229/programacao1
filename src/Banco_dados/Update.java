package Banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "Rafael2015.@";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucao_Update = "UPDATE pessoa SET nome = ? WHERE id = ?";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_Update);
            preparedStatement.setString(1, "João da Silva");
            preparedStatement.setInt(2, 30);

            preparedStatement.executeUpdate();

            preparedStatement.executeUpdate();

            System.out.println("Atualização Realizada com Sucesso!");

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

}
