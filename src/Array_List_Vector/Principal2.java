package Array_List_Vector;

import java.util.LinkedList;

public class Principal2 {

    public static void main(String[] args) {

        LinkedList<String> listaNome = new LinkedList<>();
        listaNome.add("Owsvaldo");
        listaNome.add("Maria");
        listaNome.add("João");
        listaNome.add("Sulhy");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

    }
}
