/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */


package Day23;
import java.math.*;
import java.util.Arrays;

import static java.lang.Math.log;

public class LambdaTest {
    public static void main(String args[]){
        LambdaTest tester = new LambdaTest();

        // 带有类型声明的表达式
        MathOperation addition = (int a, int b) -> a + b;

        // 没有类型声明的表达式
        MathOperation subtraction = (a, b) -> a - b;

        // 带有大括号、带有返回语句的表达式
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号和return语句的表达式
        MathOperation division = (int a, int b) -> a / b;
        //FuzaMath log = (double a, double b) -> { return log((double)a)/log((double)b);};
        MathOperation getbigger = (int a, int b) -> { return Math.max(a,b);};
        MathOperation getmin = (int a, int b) -> { return Math.min(a,b);};

        // 输出结果
        System.out.println("100 + 5 = " + tester.operate(100, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
        System.out.println("求最大值 = " + tester.operate(10, 5, getbigger));
        System.out.println("求最小值 = " + tester.operate(10, 5, getmin));

        // 没有括号的表达式
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 有括号的表达式
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);
        GreetingService greetService3 = (message) ->
                System.out.println("Hello1 " + message);

        Greeting1Service greetService4 = (message) ->
                System.out.println("Hello23 " + message);
        // 调用sayMessage方法输出结果
        greetService1.sayMessage("Shiyanlou");
        greetService2.sayMessage("Classmate");
        greetService3.sayMessage("dddClassmate");
        greetService4.sayMessage("dddClassmate");


        SeasonSlogan springs=message ->
                System.out.println("Spring " + message);
        SeasonSlogan summers=message ->
                System.out.println("summer " + message);
        SeasonSlogan autumns=message ->
                System.out.println("autumn " + message);
        SeasonSlogan winters=message ->
                System.out.println("winter " + message);
        springs.getSeason("mike∂ß");
        summers.getSeason("john");
        autumns.getSeason("TOM");
        winters.getSeason("May");


        int[] arr = {1, 23, 4, 4, 22, 34, 45, 11, 33,23, 4, 4, 22, 34, 45, 11, 33};
        System.out.println("最小数："+Arrays.stream(arr).min());
        System.out.println("最大数："+Arrays.stream(arr).max());
        System.out.println("quchong："+Arrays.stream(arr).distinct().count());
        System.out.println("数组去重乘2求和：" + Arrays.stream(arr).distinct().map((i) -> i * 2).sum());

        /*
        int source_max=list1[0];
        for(int x : list1) {
            if (x> source_max) then {
                source_max=x;

            }
            System.out.println(x);
        }
         */
    }

    // 下面是定义的一些接口和方法

    interface MathOperation {
        int operation(int a, int b);
    }

    interface FuzaMath {
        double operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    interface Greeting1Service {
        void sayMessage(String message);
    }

    interface SeasonSlogan {
        void getSeason(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
    /*
    private double oper(double a, double b, FuzaMath fuzaMath){
        return mathOperation.operation(a, b);
    }
    */
}