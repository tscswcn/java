/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Day23;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionTest {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("All of the numbers:");

        eval(list, n->true);

        System.out.println("Even numbers:");
        eval(list, n-> n%2 == 0 );
        eval(list, n-> n%2 !=0 );
        eval(list, n-> n%3 ==0 );
        System.out.println("Numbers that greater than  5:");
        eval(list, n -> n > 5 );
        eval(list, n -> n > 3 );

    List<Integer> list1=Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,12345);
        System.out.println("list1 Even numbers:");
        System.out.println("Even numbers:");
        eval(list1, n-> n%2 == 0 );
        System.out.println("add numbers:");
        eval(list1, n-> n%2 !=0 );
        System.out.println("3的倍数:");
        eval(list1, n-> n%3 ==0 );
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {

            if(predicate.test(n)) {
                System.out.println(n);
            }
        }
    }
}
