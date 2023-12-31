package z4;

public class z4 {
    public static void main(String[] args) {
        byte n = -5;
        int bezZnaku = n & 0xFF; //operacja bitowa AND z maską 0xFF

        System.out.println("Wartość zmiennej: " + n);
        System.out.println("Wartość po konwersji na bez znaku: " + bezZnaku);
    }
}


