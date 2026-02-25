package Execao_Aula1;

import java.util.Scanner;

public class Execoes3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite o numero 1 ou 2. ");
            System.out.println();

            try {
                opcao = teclado.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Voce digitou a opcão " + opcao);
                        break;
                    case 2:
                        System.out.println("Voce digitou a opção " + opcao);
                        break;
                    default:
                        throw new Exception("Erro");
                }
            } catch (Exception exececao) {
                System.out.println(exececao.getMessage());
            } finally {
                System.out.println("------------");
            }
        } while (true);
    }
}
