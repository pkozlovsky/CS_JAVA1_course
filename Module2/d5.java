package d5;

public class d5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int wynikInt = a / b;
        int resztaInt = a % b;
        System.out.println("Dzielenie (int)10/(int)3: " + wynikInt + ", reszta: " + resztaInt);
        byte c = 13;
        byte d = 5;
        byte wynikByte = (byte) (c / d);
        byte resztaByte = (byte) (c % d);
        System.out.println("Dzielenie (byte)13/(byte)5: " + wynikByte + ", reszta: " + resztaByte);
        short e = 22;
        short f = 3;
        short wynikShort = (short) (e / f);
        short resztaShort = (short) (e % f);
        System.out.println("Dzielenie (short)22/(short)3: " + wynikShort + ", reszta: " + resztaShort);
        int g = 14;
        long h = 4L;
        long wynikIntLong = g / h;
        long resztaIntLong = g % h;
        System.out.println("Dzielenie (int)14/(long)4: " + wynikIntLong + ", reszta: " + resztaIntLong);
        long i = 16L;
        int j = 3;
        long wynikLongInt = i / j;
        long resztaLongInt = i % j;
        System.out.println("Dzielenie (long)16/(int)3: " + wynikLongInt + ", reszta: " + resztaLongInt);
    }
}

