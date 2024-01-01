package z6;

import java.util.Scanner;

public class z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();

        boolean wPrzedziale1 = n >= -10 && n < 22;
        boolean wPrzedziale2 = (n >= -10 && n < 22) || (n > 36 && n <= 50);

        System.out.println("Czy n mieści się w przedziale < -10..22): " + wPrzedziale1);
        System.out.println("Czy n mieści się w przedziale < -10..22) u (36..50>: " + wPrzedziale2);
    }
}





