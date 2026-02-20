package HashMap;

import java.util.LinkedHashMap;

public class linkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
        listaNomes.put("Vivi", "Maria");
        listaNomes.put("Jaja", "João");
        listaNomes.put("FAFA", "Ana");
        listaNomes.put("SUSU", "Rafael");

        System.out.println("Conteudos do LinkedHashMap: " + listaNomes);

        LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<>(listaNomes);
        novaListaNomes.put("Lele", "kaka");
        System.out.println("Nova LinkedHashMap: " + novaListaNomes);

    }

}
