package new1;
import java.util.*;
public class ListTest {


    //���Ϻ����<>�����͵���˼
    //�����ǹ涨�˼���Ԫ�ص�����
    //�����Ժ����ϸ����
    /**
     * ���ڴ��ѧ����List
     */
    public List<Student> students;


    public ListTest() {
        this.students = new ArrayList<Student>();
    }

    /**
     * ������students�����ѧ��
     */
    public void testAdd() {
        // ����һ��ѧ�����󣬲�ͨ������add��������ӵ�ѧ������List��
        Student st1 = new Student("1", "����");
        students.add(st1);

        // ȡ�� List�е�Student����
        Student temp = students.get(0);
        System.out.println("�����ѧ����" + temp.id + ":" + temp.name);

        Student st2 = new Student("2", "����");
        students.add(0, st2);
        Student temp2 = students.get(0);
        System.out.println("�����ѧ����" + temp2.id + ":" + temp2.name);

        // �����������ʽ���
        Student[] student = {new Student("3", "����"), new Student("4", "����")};

        // Arrays����������������飨����������������ĸ��ַ�����asList() ������������һ����ָ������֧�ֵĹ̶���С���б�
        students.addAll(Arrays.asList(student));
        Student temp3 = students.get(2);
        Student temp4 = students.get(3);
        System.out.println("�����ѧ����" + temp3.id + ":" + temp3.name);
        System.out.println("�����ѧ����" + temp4.id + ":" + temp4.name);
        Student[] student2 = {new Student("5", "����"), new Student("6", "�԰�")};
        students.addAll(2, Arrays.asList(student2));
        Student temp5 = students.get(2);
        Student temp6 = students.get(3);
        System.out.println("�����ѧ����" + temp5.id + ":" + temp5.name);
        System.out.println("�����ѧ����" + temp6.id + ":" + temp6.name);
    }


    /**
     * ȡ��List�е�Ԫ�صķ���
     */
    public void testGet() {
        int size = students.size();
        for (int i = 0; i < size; i++) {
            Student st = students.get(i);
            System.out.println("ѧ����" + st.id + ":" + st.name);

        }
    }


    /**
     * ͨ��������������
     */
    // �������Ĺ����Ǳ�����ѡ�������еĶ���Java �� Iterator ֻ�ܵ����ƶ�
    public void testIterator() {
        // ͨ�����ϵ�iterator������ȡ�õ�����ʵ��
        Iterator<Student> it = students.iterator();
        System.out.println("������ѧ����ͨ�����������ʣ���");
        while (it.hasNext()) {

            Student st = it.next();
            System.out.println("ѧ��" + st.id + ":" + st.name);
        }
    }

    /**
     * ͨ��for each �������ʼ���Ԫ��
     *
     */
    public void testForEach() {
        System.out.println("������ѧ����ͨ��for each����");
        for (Student obj : students) {
            Student st = obj;
            System.out.println("ѧ����" + st.id + ":" + st.name);
        }
        //ʹ��java8 Steam��ѧ����������
        students.stream()//����Stream
                //ͨ��ѧ��id����
                .sorted(Comparator.comparing(x -> x.id))
                //���
                .forEach(System.out::println);
    }

    /**
     * �޸�List�е�Ԫ��
     *
     */
    public void testModify() {
        students.set(4, new Student("3", "���"));
    }

    /**
     * ɾ��List�е�Ԫ��
     *
     */
    public void testRemove() {
        Student st = students.get(4);
        System.out.println("����ѧ����" + st.id + ":" + st.name + "���Ҽ�����ɾ��");
        students.remove(st);
        System.out.println("�ɹ�ɾ��ѧ����");
        testForEach();

    }


    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testGet();
        lt.testIterator();
        lt.testModify();
        lt.testForEach();
        lt.testRemove();

    }
}