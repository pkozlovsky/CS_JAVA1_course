package D1;

import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int STO = 100;

        System.out.print("Podaj swoje imie: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj swoje nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Podaj swoj wiek: ");
        int wiek = scanner.nextInt();
        System.out.print("Podaj swoja wage: ");
        double waga = scanner.nextDouble();

        int lataDoStu = STO - wiek;
        double kilogramyDoStu = STO - waga;

        System.out.println("Witaj " + imie + " " + nazwisko + "!");
        System.out.println("Brakuje Ci " + lataDoStu + " lat do 100.");
        System.out.println("Brakuje Ci " + kilogramyDoStu + " kg do wagi 100 kg.");
        scanner.close();
    }
}

