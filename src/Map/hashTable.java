package Map;

import java.util.Hashtable;

public class hashTable {

    public static void main(String[] args) {
        Hashtable<Integer, String> linguagensProgramacao = new Hashtable<>();
        linguagensProgramacao.put(1, "Java");
        linguagensProgramacao.put(2, "Python");
        linguagensProgramacao.put(3, "C++");
        System.out.println("Conteudos do HashTable: " + linguagensProgramacao);

        String Valor = linguagensProgramacao.get(2);
        System.out.println("Elemento da chave 2: " + Valor);

    }
}
