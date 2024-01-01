package z7;

import java.util.Scanner;

public class z7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();

        String nalezy1 = n >= -10 && n < 22 ? "należy" : "nie należy";
        String nalezy2 = (n >= -10 && n < 22) || (n > 36 && n <= 50) ? "należy" : "nie należy";

        System.out.println("Czy n należy do przedziału <-10..22): " + nalezy1);
        System.out.println("Czy n należy do przedziału <-10..22) .. (36..50>: " + nalezy2);
    }
}






