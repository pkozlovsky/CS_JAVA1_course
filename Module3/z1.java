package z1;

import java.util.Scanner;

/*
Zadanie 1
Napisać program pobierający od użytkownika dwie zmienne (całkowita i rzeczywista).
Wykonać na nich operację inkrementacji (pre i post) oraz zaobserwować jak jest ona realizowana
w bardziej złożonych wyrażeniach. Wykonać proste operacje (w zapisie skróconym) dodawania,
odejmowania, mnożenia, dzielenia.
 */
public class z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int n = scanner.nextInt();
        System.out.print("Podaj liczbę rzeczywistą: ");
        double r = scanner.nextDouble();

        // Inkrementacja
        int preInk = ++n;
        int postInk = n++;

        // Operacje arytmetyczne
        n += 57;
        r -= 21.5;
        n *= 33;
        r /= 1.2434;

        System.out.println("pre=" + preInk + ", post=" + postInk);
        System.out.println("Nowa wartość liczby całkowitej: " + n);
        System.out.println("Nowa wartość liczby rzeczywistej: " + r);
    }
}