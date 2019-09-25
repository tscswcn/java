/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Day23;

import java.util.List;
import java.util.ArrayList;

 class LambdaTest2 {
    final static String salutation = "Hello "; //正确，不可再次赋值
    //static String salutation = "Hello "; //正确，可再次赋值
    String salutation1 = "Hello "; //报错
    final String salutation2 = "Hello "; //报错

    public static void main(String args[]){
        //final String salutation = "Hello "; //正确，不可再次赋值
        //String salutation = "Hello "; //正确，隐性为 final , 不可再次赋值

        // salution = "welcome to "
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Shiyanlou");

        LambdaTest2 lambdaTest2=new LambdaTest2();
        //lambdaTest2.na
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}




 public class LambdaTest1 {
    //private names;

    public static void main(String args[]){
        List<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Linda");
        names.add("Smith");
        names.add("Zack");
        names.add("Bob");
        //names.add(1);
        List<Object> names1 = new ArrayList<>();

        names1.add("Peter1");
        names1.add("Linda2");
        names1.add("Smith3");
        names1.add("Zack3");
        names1.add("Bob4");
        names1.add(1);
        names1.add(3.1415926756899900000);
        names1.add(true);


        //     通过System.out::println引用了输出的方法
        names.forEach(System.out::println);
        names1.forEach(System.out::println);
        names1.forEach(x -> System.out.print(x));
        //names1(System.out::println);
        for(Object s : names1) {
            System.out.println(s);
        }

        names1.forEach(x -> System.out.print(x));

        //for (names1) { System.out.print(names1.getClass());

        //}
    }
}