package Lendo_Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        String nome = "C:\\Users\\Administrador\\Documents\\arquivox.txt.txt";

        System.out.printf("\nConteudo do arquivo texto: \n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = lerArq.readLine();
            }
            arq.close();

        } catch (IOException e) {
            System.out.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
        }
        System.out.println();
    }

}
