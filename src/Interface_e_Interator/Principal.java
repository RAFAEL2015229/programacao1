package Interface_e_Interator;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Owsvaldo");
        listaNome.add("Maria");
        listaNome.add("João");
        listaNome.add("Sulhy");

        for (String nome : listaNome) {
            System.out.println("Nome: " + nome);
        }
    }
}
