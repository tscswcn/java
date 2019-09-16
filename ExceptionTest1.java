package new1;

import java.util.Arrays;

class ExceptionTest2 extends ArithmeticException {
    //自定义异常类，该类继承自ArithmeticException

    public ExceptionTest2() {

    }
    //实现默认的无参构造方法

    public ExceptionTest2(String msg) {
        super(msg);
    }
    //实现可以自定义输出信息的构造方法，将待输出信息作为参数传入即可
}

public class ExceptionTest1 extends ArithmeticException {
    public ExceptionTest1(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        int[] array = new int[5];
        //声明一个长度为5的数组

        Arrays.fill(array, 5);
        //将数组中的所有元素赋值为5

        for (int i = 4; i > -1; i--) {
            //使用for循环逆序遍历整个数组，i每次递减

            if (i == 0) {
            // 如果i除以了0，就使用带异常信息的构造方法抛出异常

                throw new ExceptionTest1("There is an exception occured.");
            }

            System.out.println("array[" + i + "] / " + i + " = " + array[i] / i);
            // 如果i没有除以0，就输出此结果
        }
    }
}