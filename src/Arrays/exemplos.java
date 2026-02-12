package Arrays;

import java.util.Scanner;

public class exemplos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String matricula, nome, situacao, turma;
        double teste, prova, media;

        System.out.println("Digite a turma: ");
        turma = teclado.next();

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite a matricula: ");
            matricula = teclado.next();

            System.out.println("Digite a nome: ");
            nome = teclado.next();

            System.out.println("Digite quanto foi o teste: ");
            teste = teclado.nextDouble();

            System.out.println("Digite quanto foi a prova: ");
            prova = teclado.nextDouble();

            media = (teste + prova) / 2;

            System.out.println("Seu Nome e Matricula são: " + nome + " e " + matricula);
            System.out.println("Teste: " + teste);
            System.out.println("Média: " + media);

        }

    }
}
