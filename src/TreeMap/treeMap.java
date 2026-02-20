package TreeMap;

import java.util.TreeMap;

public class treeMap {

    public static void main(String[] args) {
        TreeMap<String, String> mapasNomes = new TreeMap<>();
        mapasNomes.put("Vivi", "Maria");
        mapasNomes.put("Jaja", "João");
        mapasNomes.put("FAFA", "Ana");
        mapasNomes.put("SUSU", "Rafael");

        System.out.println("Conteudos do TreeMap: " + mapasNomes);

        System.out.println("Chaves: " + mapasNomes.keySet());
        System.out.println("Valores: " + mapasNomes.values());
        System.out.println("Tamanho do TreeMap: " + mapasNomes.size());
    }

}
