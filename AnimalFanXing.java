package new1;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public Animal(){
        System.out.println("���Ƕ���");
    }
}

 class Dog1 extends Animal {
    public Dog1(){
        System.out.println("���ǹ�");
    }
}

public class AnimalFanXing {

/*
ע�⣺��������Ͳ����ķ���������ҪĿ����Ϊ�˱���������Լ�����ֵ֮��Ĺ�ϵ�����籾������T��S�ļ̳й�ϵ�� ����ֵ�����ͺ͵�һ�����Ͳ�����ֵ��ͬ��
*/

    public<T, S extends T> T testDemo(T t, S s){
        System.out.println("���� T ���ͣ��ҵ�������" + t.getClass().getName());
        System.out.println("���� S ���ͣ��ҵ�������" + s.getClass().getName());
        System.out.println("���������T, S");
        return t;
    }
    
    public void testDemo(List<?> s){
        for(Object obj:s){
            System.out.println("�ҵ�������" + obj.getClass().getName());
            System.out.println("��������ڣ����Ƿ��ͷ�����");
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
        System.out.println("�������� a���ҵ�������" + a1.getClass().getName());
    }

}
    
    
    
