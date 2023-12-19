package D4;

import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promien kola: ");
        double r = scanner.nextDouble();

        double pole = Math.PI * Math.pow(r,2);
        double obwod = 2 * Math.PI * r;
        double Vkuli = 4/3.0 * Math.PI * Math.pow(Math.sqrt(r),3);

        System.out.printf("Dla kola o promieniu %.3f, pole = %.3f, obwod = %.3f%n ",r,pole,obwod);
        System.out.printf("Objetosc kuli o promieniu %.3f to %.3f ",Math.sqrt(r),Vkuli);

        scanner.close();
    }
}