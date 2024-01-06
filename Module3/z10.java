package z10;

import java.util.Scanner;

public class z10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę (0-127): ");
        int n = scanner.nextInt();
        System.out.println("Podana liczba w postaci binarnej: "+Integer.toBinaryString(n));
        System.out.print("O ile bitów przesunąć w lewo: ");
        int przesuniecieLewo = scanner.nextInt();
        n <<= przesuniecieLewo;
        System.out.println("Podana po przesunieciu w lewo: "+Integer.toBinaryString(n));
        System.out.print("O ile bitów przesunąć w prawo: ");
        int przesunieciePrawo = scanner.nextInt();
        n >>= przesunieciePrawo;
        System.out.println("Podana po przesunieciu w prawo: "+Integer.toBinaryString(n));


        System.out.print("Który bit sprawdzić: ");
        int bitDoSprawdzenia = scanner.nextInt();
        System.out.println("Bit " + bitDoSprawdzenia + " jest " + ((n & (1 << bitDoSprawdzenia)) != 0 ? "ustawiony" : "nieustawiony"));

        System.out.print("Który bit ustawić: ");
        int bitDoUstawienia = scanner.nextInt();
        n |= (1 << bitDoUstawienia);

        System.out.print("Który bit wyzerować: ");
        int bitDoWyzerowania = scanner.nextInt();
        n &= ~(1 << bitDoWyzerowania);

        System.out.println("Ostateczna wartość liczby: " + n);
    }
}









