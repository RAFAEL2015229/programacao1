package Interface_e_Interator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exemplo3 {

    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Owsvaldo");
        listaNome.add("Maria");
        listaNome.add("João");
        listaNome.add("Sulhy");

        System.err.println("Elementos antes da Ordenação: ");
        for (int i = 0; i < listaNome.size(); i++) {
            System.out.println(listaNome.get(i));

            Comparator<String> comparator = Collections.reverseOrder();
            Collections.sort(listaNome, comparator);

            System.err.println("Elementos depois da Ordenação: ");

            for (int j = 0; j < listaNome.size(); j++) {
                System.out.println(listaNome.get(j));
            }
        }
    }
}
