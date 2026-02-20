package Array_List_Vector;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Owsvaldo");
        listaNome.add("Maria");
        listaNome.add("João");
        listaNome.add("Sulhy");

        System.out.println("Antes");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
        System.out.println("Maria ");
        System.out.println();
        System.out.println();
        System.out.println("Depois");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

    }
}
