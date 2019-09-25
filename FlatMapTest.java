/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Day23;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("shi yan", "shi yan lou","lou yan shi");
        Stream<String> stringStream2 = Stream.of("shi yan", "shi yan lou","lou yan shi");
        Stream<String[]> mapStream = stringStream1
                //map将一种类型的流 转换为另外一个类型的流  这里转换成了String[]流
                //这并不是我们想要的，我们想要的是Stream<String>,而不是Stream<String[]>
                .map(v -> v.split(" "));
        Stream<String> flatMapStream = stringStream2
                //Arrays.stream将数组转换成了流 这里将分割后的String[]，转换成了Stream<String>，但是我们前面定义了三个字符串
                //所以这里将产生三个Stream<String>，flatMap用于将三个流合并成一个流
                .flatMap(v -> Arrays.stream(v.split(" ")));
        System.out.println("mapStream打印：");
        mapStream.peek(System.out::println).count();
        System.out.println("flatMapStream打印：");
        flatMapStream.peek(System.out::println).count();

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream<Integer> stream3 = Stream.of(7, 8, 9);
        Stream<Integer> mergerStream = Stream.of(stream1, stream2, stream3).flatMap((i) -> i);
        mergerStream.forEach(System.out::print);

    }
}
