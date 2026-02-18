package Strings;

public class Exemplo3 {

    public static void main(String[] args) {
        String nome = "Rafael";
        String sobrenome = "Borges";
        String nomeCompleto = nome + sobrenome;
        String nomeComBuilder;

        StringBuilder teste = new StringBuilder();

        teste.append(nome);
        teste.append(sobrenome);

        nomeComBuilder = teste.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuilder);

    }
}
