package Lendo_Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacao {

    public static void main(String[] args) {
        Aluno p1 = new Aluno("FAFA", 0, 10);
        Aluno p2 = new Aluno("SUSU", 8, 10);

        try {
            FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Aluno pr1 = (Aluno) oi.readObject();
            Aluno pr2 = (Aluno) oi.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Erro");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
    }
}
