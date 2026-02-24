package Banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "Rafael2015.@";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucao_Select = "SELECT * FROM pessoa WHERE id = ?";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_Select);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }

            preparedStatement.execute();

            System.out.println("Consulta Realizada com Sucesso!");

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

}
