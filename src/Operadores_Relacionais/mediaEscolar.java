package Operadores_Relacionais;

import java.util.Scanner;

public class mediaEscolar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = input.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
