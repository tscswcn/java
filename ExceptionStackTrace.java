package new1;

public class ExceptionStackTrace {
    private static void method1() {
        method2();
    }

    private static void method2() {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            //��ӡ��ջ�켣
            e.printStackTrace();
        }
    }
}