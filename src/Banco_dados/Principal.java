package Banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;

public class Principal {

    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "Rafael2015.@";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem sucedida!");
        } catch (Exception exception) {
            System.out.println("Erro na conexão com o banco de dados");
        }

    }

}
