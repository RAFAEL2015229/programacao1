package Map;

import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> linguagensProgramacao = new HashMap<>();
        linguagensProgramacao.put(1, "Java");
        linguagensProgramacao.put(2, "Python");
        linguagensProgramacao.put(3, "C++");
        System.out.println("Conteudos do HashMap: " + linguagensProgramacao);

        System.out.println("Chaves: " + linguagensProgramacao.keySet());
        System.out.println("Valores: " + linguagensProgramacao.values());
        System.out.println("Chave/Valor: " + linguagensProgramacao.entrySet());

    }
}
