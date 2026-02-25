package Gravando_Arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        String nome;
        double teste, prova;
        int faltas;

        FileWriter arq = new FileWriter("C:\\Users\\Administrador\\Documents\\arquivox.txt.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        System.out.println("Digite sua Matricula: ");
        matricula = teclado.next();

        System.out.println("Digite seu Nome: ");
        nome = teclado.next();

        System.out.println("Digite sua nota teste: ");
        teste = teclado.nextDouble();

        System.out.println("Digite sua nota: ");
        prova = teclado.nextDouble();

        System.out.println("Digite suas faltas: ");
        faltas = teclado.nextInt();

        gravarArq.println(matricula);
        gravarArq.println(nome);
        gravarArq.println(teste);
        gravarArq.println(prova);
        gravarArq.println(faltas);

        arq.close();

        System.out.println("Gravação feita com sucesso.");

    }
}
