package Estrutura_Repeticao;

import java.util.Scanner;

public class praticaCase {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;

        do {

            System.out.println("------------------");
            System.out.println("Menu de opções");
            System.out.println("------------------");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Opção para aluno.");
            System.err.println("2 - Professor");
            System.out.println("3 - Coordenador");
            System.out.println("0 - Sair.");

            System.out.println("Digite a opção em que deseja: ");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Voce e um aluno ");
                    break;
                case 2:
                    System.out.println("Voce e um professor ");
                    break;
                case 3:
                    System.out.println("Voce e um coordenador");
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente.");

                    if (op == 1) {
                        System.out.println("Parabens, voce acessou a aba Aluno!! ");
                    } else if (op == 2) {
                        System.out.println("Parabens, voce acessou a aba Professor!! ");
                    } else if (op == 3) {
                        System.out.println("Parabens, voce acessou a aba Coordenador!! ");
                    }
            }

        } while (op != 0);
        System.out.println("Programa encerrado.");

    }
}
