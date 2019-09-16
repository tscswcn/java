package new1;

public class MathTest {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Math.max(Math.max(a, b),c));
    }

}