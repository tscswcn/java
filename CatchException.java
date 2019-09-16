package new1;

public class CatchException {
    public static void main(String[] args) {
        try {
            // ���涨����һ��try����

            System.out.println("I am try block.");

            Class<?> tempClass = Class.forName("");    
            // ����һ���յ�Class����������������δ�����쳣��
            System.out.println("Bye! Try block.");

        } catch (ClassNotFoundException e) {
            // ���涨����һ��catch����
            System.out.println("I am catch block.");

            e.printStackTrace();
            //printStackTrace()�����������������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��

            System.out.println("Goodbye! Catch block.");

        } finally {
            // ���涨����һ��finally����
            System.out.println("I am finally block.");
        }
    }
}