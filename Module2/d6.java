package d6;

public class d6 {
    public static void main(String[] args) {
        float a = 2.0f;
        float b = 3.0f;
        float iloczyn = a * b;
        float iloraz = a / b;
        float suma = a + b;
        float roznica = a - b;
        float potega = (float) Math.pow(a, b);

        System.out.printf("Iloczyn: %.12f%n", iloczyn);
        System.out.printf("Iloraz: %.12f%n", iloraz);
        System.out.printf("Suma: %.12f%n", suma);
        System.out.printf("Roznica: %.12f%n", roznica);
        System.out.printf("Potega: %.12f%n", potega);

        float dzielenie = 1.0f / 3.0f;
        System.out.printf("Dzielenie float 1.0f/3.0f: %.12f%n", dzielenie);
        byte dzielenie2 = 1 / 3;
        System.out.printf("Dzielenie calkowite 1/3: %d%n", dzielenie2);
    }
}

