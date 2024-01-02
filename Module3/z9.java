package z9;

public class z9 {
    public static void main(String[] args) {
        byte nByte = 10;
        int nInt = 10;
        byte negnByte = -10;
        int negnInt = -10;

        System.out.println("Przesunięcia 8 razy w lewo dla byte:");
        for (int i = 0; i < 8; i++) {
            nByte <<= 1;
            negnByte <<= 1;
            System.out.printf("%3d: %8s %8s\n", i, Integer.toBinaryString(nByte & 0xFF), Integer.toBinaryString(negnByte & 0xFF));
        }

        System.out.println("\nPrzesunięcia 8 razy w lewo dla int:");
        for (int i = 0; i < 8; i++) {
            nInt <<= 1;
            negnInt <<= 1;
            System.out.printf("%3d: %32s %32s\n", i, Integer.toBinaryString(nInt), Integer.toBinaryString(negnInt));
        }

        System.out.println("\nPrzesunięcia 8 razy w prawo dla byte:");
        for (int i = 0; i < 8; i++) {
            nByte >>= 1;
            negnByte >>= 1;
            System.out.printf("%3d: %8s %8s\n", i, Integer.toBinaryString(nByte & 0xFF), Integer.toBinaryString(negnByte & 0xFF));
        }

        System.out.println("\nPrzesunięcia 8 razy w prawo dla int:");
        for (int i = 0; i < 8; i++) {
            nInt >>= 1;
            negnInt >>= 1;
            System.out.printf("%3d: %32s %32s\n", i, Integer.toBinaryString(nInt), Integer.toBinaryString(negnInt));
        }
    }
}








