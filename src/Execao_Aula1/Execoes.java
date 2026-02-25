package Execao_Aula1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Execoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        try {
            System.out.println("Digite o Numerador:");
            valor = scanner.nextInt();

            int resultado = valor / 3;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("AritmeticException => " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
    }
}
