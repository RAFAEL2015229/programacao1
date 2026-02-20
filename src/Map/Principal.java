package Map;

import java.util.HashMap;

public class Principal {

    public static void main(String[] args) {
        HashMap<Integer, String> linguagensProgramacao = new HashMap<>();
        linguagensProgramacao.put(1, "Java");
        linguagensProgramacao.put(2, "Python");
        linguagensProgramacao.put(3, "C++");
        System.out.println("Conteudos do HashMap: " + linguagensProgramacao);

        String Valor = linguagensProgramacao.get(2);
        System.out.println("Elemento da chave 2: " + Valor);

    }
}
