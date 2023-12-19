package D2;

public class d2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        System.out.printf("Wprowadzone zmienne: %d i %d%n",a,b);
        System.out.println("Dodawanie: " + (a + b));
        System.out.println("Odejmowanie: " + (a - b));
        System.out.println("Mnozenie: " + (a * b));
        // Dzielenie calkowite
        System.out.println("Dzielenie (calkowite): " + (a / b));

        // Dzielenie rzeczywiste
        double c = 12.0;
        double d = 3.0;
        System.out.printf("Wprowadzone zmienne: %.1f i %.1f%n",c,d);
        System.out.println("Dzielenie rzeczywiste: " + (c / d));
        System.out.println("Reszta z dzielenia: " + (a % b));

        // Operatory pre i post inkrementacji/dekrementacji
        int x = 5;
        System.out.println("Wartosc poczatkowa x: " + x);
        System.out.println("Postinkrementacja (x++): " + (x++));
        System.out.println("Wartosc x po postinkrementacji: " + x);
        System.out.println("Preinkrementacja (++x): " + (++x));
        System.out.println("Dekrementacja (x--): " + (x--));
        System.out.println("Wartosc x po dekrementacji: " + x);
    }
}
