package new1;

import java.util.Arrays;

class ExceptionTest2 extends ArithmeticException {
    //�Զ����쳣�࣬����̳���ArithmeticException

    public ExceptionTest2() {

    }
    //ʵ��Ĭ�ϵ��޲ι��췽��

    public ExceptionTest2(String msg) {
        super(msg);
    }
    //ʵ�ֿ����Զ��������Ϣ�Ĺ��췽�������������Ϣ��Ϊ�������뼴��
}

public class ExceptionTest1 extends ArithmeticException {
    public ExceptionTest1(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        int[] array = new int[5];
        //����һ������Ϊ5������

        Arrays.fill(array, 5);
        //�������е�����Ԫ�ظ�ֵΪ5

        for (int i = 4; i > -1; i--) {
            //ʹ��forѭ����������������飬iÿ�εݼ�

            if (i == 0) {
            // ���i������0����ʹ�ô��쳣��Ϣ�Ĺ��췽���׳��쳣

                throw new ExceptionTest1("There is an exception occured.");
            }

            System.out.println("array[" + i + "] / " + i + " = " + array[i] / i);
            // ���iû�г���0��������˽��
        }
    }
}