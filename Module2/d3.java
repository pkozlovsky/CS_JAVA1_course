package D3;

import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dlugosc pierwszego boku prostokata: ");
        float a = scanner.nextFloat();
        System.out.print("Podaj dlugosc drugiego boku prostokata: ");
        float b = scanner.nextFloat();

        float pole = a * b;
        float obwod = 2 * (a + b);

        System.out.printf("Pole prostokata: %.4f%n", pole);
        System.out.printf("Obwod prostokata: %.4f%n", obwod);

        System.out.printf("Pole prostokata zaokraglone do dwoch: %.2f%n", pole);
        System.out.printf("Obwod prostokata zaokraglone do dwoch: %.2f%n", obwod);

        scanner.close();
    }
}

