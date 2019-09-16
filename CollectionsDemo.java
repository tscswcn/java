package new1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
//        ����һ����List
        List<Integer> list = new ArrayList<>();
        //��ֵ
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(12);
        System.out.print("��ʼ˳��");
        list.forEach(v -> System.out.print(v + "\t"));


        //����˳��
        Collections.shuffle(list);
        System.out.print("\n����˳��");
        list.forEach(v -> System.out.print(v + "\t"));

        //��ת
        Collections.reverse(list);
        System.out.print("\n��ת���ϣ�");
        list.forEach(v -> System.out.print(v + "\t"));

        //��һ��λ�����һλ����
        Collections.swap(list,0,list.size()-1);
        System.out.print("\n������һλ�����һλ��");
        list.forEach(v -> System.out.print(v + "\t"));

        //����Ȼ��������
        Collections.sort(list);
        System.out.print("\nSort�����");
        list.forEach(v -> System.out.print(v + "\t"));

        //���ֲ��� ���������
        System.out.print("\n���ֲ�����ֵ7��λ�ã�"+Collections.binarySearch(list, 7));

        //�����̰߳�ȫ��list
        List<Integer> synchronizedList = Collections.synchronizedList(list);
    }
}