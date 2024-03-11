public class Narrowing {
    public static void main(String[] args) {
        double a = 456.789;
        int b = (int) a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        float c = 1000.99f;
        long d = (long) c;
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        long e = 987654321L;
        int f = (int) e;
        System.out.println("e: " + e);
        System.out.println("f: " + f);

        int g = 100;
        short h = (short) g;
        System.out.println("g: " + g);
        System.out.println("h: " + h);

        short i = 256;
        byte j = (byte) i;
        System.out.println("i: " + i);
        System.out.println("j: " + j);

        
    }
}
