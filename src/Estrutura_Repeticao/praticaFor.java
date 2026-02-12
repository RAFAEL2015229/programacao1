package Estrutura_Repeticao;

import java.util.Scanner;

public class praticaFor {

    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4, media;
        Scanner input = new Scanner(System.in);

        for (int na = 1; na <= 4; na++) {
            System.out.println("Nota do Aluno: " + na);

            System.out.println("Digite a primeira nota: ");
            nota1 = input.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = input.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota3 = input.nextDouble();
            System.out.println("Digite a quarta nota: ");
            nota4 = input.nextDouble();

            media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A media do aluno é: " + media);

            if (media <= 5) {
                System.out.println("O aluno " + na + " está reprovado!");
            } else if (media == 5 || media <= 6) {
                System.out.println("O aluno " + na + " está de recuperação! ");
            } else {
                System.out.println("O aluno " + na + " está aprovado! ");
            }
            System.out.println("--------------------------------------------------");

        }
    }
}
