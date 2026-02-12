package Estrutura_Repeticao;

public class estruturaCase {

    public static void main(String[] args) {

        int numero = 123;

        switch (numero) {
            case 1:
                System.out.println("Voce digitou numero 1");
                break;
            case 2:
                System.out.println("Voce digitou numero 2");
                break;
            case 3:
                System.out.println("Voce digitou numero 3");
                break;
            default:
                System.out.println("Voce digitou um numero diferente de 1, 2 ou 3");
        }
    }
}
