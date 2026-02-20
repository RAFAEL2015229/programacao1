package Interface_e_Interator;

import java.util.ArrayList;
import java.util.Iterator;

public class Exemplo2 {

    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Owsvaldo");
        listaNome.add("Maria");
        listaNome.add("João");
        listaNome.add("Sulhy");

        Iterator<String> iterator = listaNome.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
