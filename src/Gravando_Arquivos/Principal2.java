package Gravando_Arquivos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        String nome;
        double teste, prova;
        int faltas;

        FileOutputStream arq = new FileOutputStream("C:\\Users\\Administrador\\Documents\\arquivox.dat.txt");
        DataOutputStream gravarArq = new DataOutputStream(arq);

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

        gravarArq.writeUTF(matricula);
        gravarArq.writeUTF(nome);
        gravarArq.writeDouble(teste);
        gravarArq.writeDouble(prova);
        gravarArq.writeInt(faltas);

        arq.close();

        System.out.println("Gravação feita com sucesso.");

    }
}
