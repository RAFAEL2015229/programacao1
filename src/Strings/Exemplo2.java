package Strings;

public class Exemplo2 {

    public static void main(String[] args) {
        String nome = "Rafael";
        String nomeGuerra = "Rafael";
        String sobrenome = new String("Rafael");

        if (nome.equals(nomeGuerra)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }

        if (nome.equals(sobrenome)) {
            System.err.println("Nome Iguais");
        } else {
            System.err.println("Nomes Diferentes");
        }
    }
}
