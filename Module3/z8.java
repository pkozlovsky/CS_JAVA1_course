package z8;

import java.util.Scanner;

public class z8 {
    public static void main(String[] args) {
        int n = 10;
        int wynikNegacji = ~n;

        System.out.println("Wartość przed negacją: " + n);
        System.out.println("Wartość po negacji: " + wynikNegacji);
        System.out.println("Wartość po negacji (binarnie): " + Integer.toBinaryString(wynikNegacji));
    }
}







