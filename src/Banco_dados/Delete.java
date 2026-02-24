package Banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "Rafael2015.@";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucao_Delete = "DELETE FROM pessoa WHERE id = ?";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_Delete);

            preparedStatement.setInt(1, 30);

            preparedStatement.executeUpdate();

            preparedStatement.executeUpdate();

            System.out.println("Consulta Realizada com Sucesso!");

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

}
