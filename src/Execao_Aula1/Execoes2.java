package Execao;

import java.util.InputMismatchException;

public class Execoes2 {

    public static void main(String[] args) {
        try {
            int array[] = new int[5];
            array[10] = 10 / 2; // Isso causará ArrayIndexOutOfBoundsException
            System.out.println(array[0]);

        } catch (ArithmeticException e) {
            System.out.println("AritmeticException => " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        } finally {
            System.out.println("fim.");
        }
    }
}
