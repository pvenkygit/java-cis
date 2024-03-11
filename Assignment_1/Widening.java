public class Widening{
    public static void main(String[] args) {
        int a = 10;
        long b = a; 

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        short c = 100;
        int d = c; 
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        int e = 1000;
        long f = e; 
        System.out.println("e: " + e);
        System.out.println("f: " + f);

        long g = 100000L;
        float h = g;
        System.out.println("g: " + g);
        System.out.println("h: " + h);

        float i = 3.14f;
        double j = i; 
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

