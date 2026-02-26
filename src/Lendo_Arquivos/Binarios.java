package Lendo_Arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Binarios {

    public static void main(String[] args) throws IOException {
        String matricula;
        String nome;
        double teste, prova, media;
        int faltas;

        FileInputStream arq = new FileInputStream("C:\\Users\\Administrador\\Documents\\arquivox.dat.txt");
        DataInputStream lerArq = new DataInputStream(arq);

        matricula = lerArq.readUTF();
        nome = lerArq.readUTF();
        teste = lerArq.readDouble();
        prova = lerArq.readDouble();
        faltas = lerArq.readInt();

        media = (teste + prova) / 2;

        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Teste: " + teste);
        System.out.println("Prova: " + prova);
        System.out.println("Faltas: " + faltas);
        System.out.println("Media; " + media);

        arq.close();

    }
}
