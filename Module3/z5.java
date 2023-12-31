package z5;

public class z5 {
    public static void main(String[] args) {
        int n1 = -1;
        int n2 = -2;

        System.out.println("Wartości przed konwersją: " + n1 + ", " + n2);
        System.out.println("Wynik dzielenia: " + (n1 / n2));

        String bezZnaku1 = Integer.toUnsignedString(n1);
        String bezZnaku2 = Integer.toUnsignedString(n2);

        System.out.println("Wartości po konwersji na bez znaku: " + bezZnaku1 + ", " + bezZnaku2);
    }
}




