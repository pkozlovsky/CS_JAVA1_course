package z11;

import java.util.Scanner;

public class z11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość x: ");
        double x = scanner.nextDouble();

        double y = Math.sqrt(Math.pow(x,2) + 7)/4 - Math.pow(x,2) + Math.sin(x)/6;

        System.out.println("Wynik równania: " + y);
    }
}










