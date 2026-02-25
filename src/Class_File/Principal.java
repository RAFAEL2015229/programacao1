package Class_File;

import java.io.File;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o nome do arquivo path: \n");
        String nome = teclado.next();

        File objFile = new File(nome);
        if (objFile.exists()) {
            if (objFile.isFile()) {
                System.out.println("Nome do Arquivo: " + objFile.getName());
                System.out.println("Tamanho do Arquivo: " + objFile.length());
            }
        } else {
            System.out.println("Arquivo Inexistente. ");
        }
    }
}
