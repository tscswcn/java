package new1;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public Animal(){
        System.out.println("我是动物");
    }
}

 class Dog1 extends Animal {
    public Dog1(){
        System.out.println("我是狗");
    }
}

public class AnimalFanXing {

/*
注意：定义带类型参数的方法，其主要目的是为了表达多个参数以及返回值之间的关系。例如本例子中T和S的继承关系， 返回值的类型和第一个类型参数的值相同。
*/

    public<T, S extends T> T testDemo(T t, S s){
        System.out.println("我是 T 类型，我的类型是" + t.getClass().getName());
        System.out.println("我是 S 类型，我的类型是" + s.getClass().getName());
        System.out.println("这个方法内T, S");
        return t;
    }
    
    public void testDemo(List<?> s){
        for(Object obj:s){
            System.out.println("我的类型是" + obj.getClass().getName());
            System.out.println("这个方法内，不是泛型方法内");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	AnimalFanXing test = new AnimalFanXing();
        Dog1 a0 = new Dog1();
        Animal a1 = new Animal();
        List<Animal> s = new ArrayList<Animal>();
        s.add(a0);
        s.add(a1);
        test.testDemo(s);
        
        
        // TODO Auto-generated method stub
    	AnimalFanXing test2 = new AnimalFanXing();
        Dog1 d = new Dog1();
        Animal a02 = new Animal();
        Animal a12  = test2.testDemo(a0, d);
        System.out.println("我是整数 a，我的类型是" + a1.getClass().getName());
    }

}
    
    
    
