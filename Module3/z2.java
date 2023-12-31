package z2;

import java.util.Scanner;

/*
Zadanie 2
Napisać program pobierający od użytkownika wartość całkowitą. Program ma podać informację,
czy wprowadzona n jest n parzysta czy nie. Nie używamy żadnych funkcji standardowych
a jedynie dostępne operatory arytmetyczne.
 */
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();
        boolean czyParzysta = (n % 2) == 0;
        System.out.println(n + " jest " + (czyParzysta ? "parzysta" : "nieparzysta"));
    }
}
