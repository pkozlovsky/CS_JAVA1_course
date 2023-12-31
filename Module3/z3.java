package z3;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        int binarna = 0b10000001;
        int hexa = 0x11;

        System.out.println("Binarnie: " + Integer.toBinaryString(binarna));
        System.out.println("Szesnastkowo: " + Integer.toHexString(hexa));

        double wynik = ++binarna - hexa--;

        System.out.println("Wynik: " + wynik);
        System.out.println("Nowa wartość zmiennej binarnej: " + binarna);
        System.out.println("Nowa wartość zmiennej szesnastkowej: " + hexa);
    }
}

