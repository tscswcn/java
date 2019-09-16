package new1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Set;
/*
 * ��Ŀ�鳤��
 */
 class PD {

    public String id;
    public String name;
    //���Ϻ����<>�����͵���˼
    //�����ǹ涨�˼���Ԫ�ص�����
    public Set<Student1> student1s;
    public PD(String id, String name){
        this.id = id;
        this.name = name;
        this.student1s = new HashSet<Student1>();
    }
}
 
class Student1 {
	    public String id;
	    public String name;
	    public Student1(String id, String name){
	        this.id = id;
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "Student1{" +
	                "id='" + id + '\'' +
	                ", name='" + name + '\'' +
	                '}';
	    }
	}
public class SetTest {

    public List<Student> student1s;

    public SetTest() {
        student1s = new ArrayList<Student>();
    }

    /*
     * ������Student1s�����ѧ��
     */
    public void testAdd() {
        //����һ��ѧ�����󣬲�ͨ������add��������ӵ�ѧ������List��
        Student1 st1 = new Student("1", "����");
        student1s.add(st1);

        //��ӵ�List�е����;�ΪObject������ȡ��ʱ����Ҫǿת

        Student st2 = new Student("2","����");
        Student1s.add(st2);

        Student[] student = {new Student("3", "����"),new Student("4", "����")};
        Student1s.addAll(Arrays.asList(student));

        Student[] student2 = {new Student("5", "����"),new Student("6", "�԰�")};
        Student1s.addAll(Arrays.asList(student2));

    }

    /**
     * ͨ��for each �������ʼ���Ԫ��
     * @param args
     */
    public void testForEach() {
        System.out.println("������ѧ����ͨ��for each����");
        for(Object obj:Student1s){
            Student st = (Student)obj;
            System.out.println("ѧ����" + st.id + ":" + st.name);
        }
    }

    public static void main(String[] args){
        SetTest st = new SetTest();
        st.testAdd();
        st.testForEach();
        PD pd = new PD("1","����ʦ");
        System.out.println("�룺" + pd.name + "ѡ��С���Ա��");
        //����һ�� Scanner �����������մӼ��������ѧ�� ID
        Scanner console = new Scanner(System.in);

        for(int i = 0;i < 3; i++){
            System.out.println("������ѧ�� ID");
            String studentID = console.next();
            for(Student1 s:st.student1s){
                if(s.id.equals(studentID)){
                    pd.student1s.add(s);
                }
            }
        }
        st.testForEachForSer(pd);
        // �ر� Scanner ����
        console.close();
    }
    //��ӡ�������ʦ��ѡ��ѧ����Set�����Ԫ��ֻ����foreach �� iterator 
    //����ʹ�� get() ��������Ϊ��������ģ������� List һ����ѯ����������Ԫ��
    public void testForEachForSer(PD pd){
        for(Student1 s: pd.student1s) {
        System.out.println("ѡ����ѧ����" + s.id + ":" + s.name);
        }
    }

}