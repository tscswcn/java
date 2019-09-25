/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Day23;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateDemo {
    public static void main(String[] args) {
        //简单使用  判断a是否大于5
        Predicate<Integer> predicate = a -> a > 50;
        System.out.println(predicate.test(52));
        //如果只断言int类型，可以直接使用 IntPredicate
        IntPredicate intPredicate = a -> a > 50;
        System.out.print("ddddd");
        System.out.println(intPredicate.test(50));
        //IntStream.of(10,11,44,59,46,55,99,88,50,10,11,44,59,46,55,99,88,50)
        IntStream.of(10,11,44)
                //结合filter过滤数字 小于或等于50的数字被过滤
                .filter(intPredicate)
                .peek(System.out::println).count();


        Predicate<Integer> predicate1=a->a>30;
        System.out.println(predicate1.test(30));
        IntPredicate intPredicate1=a-> a>30;
        System.out.print("ddddd");
        System.out.println(intPredicate1.test(+50));
        IntStream.of(10,11,44).filter(intPredicate1).peek(System.out::println).count();

        /*
         /usr/local/mysql/bin/mysqld --user=_mysql --basedir=/usr/local/mysql --datadir=/usr/local/mysql/data --plugin-dir=/usr/local/mysql/lib/plugin --log-error=/usr/local/mysql/data/mysqld.local.err --pid-file=/usr/local/mysql/data/mysqld.local.pid --keyring-file-data=/usr/local/mysql/keyring/keyring --early-plugin-load=keyring_file=keyring_file.so --default_authentication_plugin=mysql_native_password
         建立一个数组1, 23, 4, 4, 22, 34, 45, 11, 33
          使用 lambda 求出数组中的最小数
         将数组去重，并将去重后数组的每个元素乘以 2，再求出乘以 2 后的数组的和，比如数组1,2,3,3，去重后为1,2,3，乘以 2 后为2,4,6，最后的和为12。


         */
        // List<Integer> list1=Arrays.asList(1, 23, 4, 4, 22, 34, 45, 11, 33);
       // () -> list1


    }



}