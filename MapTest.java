package new1;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

 class Course {
    public String id;
    public String name;
    public Course(String id, String name){
        this.id = id;
        this.name = name;
    }
}
public class MapTest {

    /**
     * ������װ�γ����Ͷ���
     */
    public Map<String, Course> courses;

    /**
     * �ڹ������г�ʼ�� courses ����
     * @param args
     */
    public MapTest() {
        this.courses = new HashMap<String, Course>();
    }

    /**
     * ������ӣ�����γ� ID���ж��Ƿ�ռ��
     * ��δ��ռ�ã�����γ����ƣ������¿γ̶���
     * ������ӵ� courses ��
     * @param args
     */
    public void testPut() {
        //����һ�� Scanner ����������ȡ����Ŀγ� ID ������
        Scanner console = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.println("������γ� ID��");
            String ID = console.next();
            //�жϸ� ID �Ƿ�ռ��
            Course cr = courses.get(ID);
            if(cr == null){
                //��ʾ����γ�����
                System.out.println("������γ����ƣ�");
                String name = console.next();
                //�����µĿγ̶���
                Course newCourse = new Course(ID,name);
                //ͨ������ courses �� put ��������� ID-�γ�ӳ��
                courses.put(ID, newCourse);
                System.out.println("�ɹ���ӿγ̣�" + courses.get(ID).name);
            }
            else {
                System.out.println("�ÿγ� ID �ѱ�ռ��");
                continue;
            }
        }
    }

    /**
     * ���� Map �� keySet ����
     * @param args
     */

    public void testKeySet() {
        //ͨ�� keySet ���������� Map �е����м��� Set ����
        Set<String> keySet = courses.keySet();
        //���� keySet��ȡ��ÿһ�������ڵ��� get ����ȡ��ÿ������Ӧ�� value
        for(String crID: keySet) {
            Course cr = courses.get(crID);
            if(cr != null){
                System.out.println("�γ̣�" + cr.name);
            }
        }
    }

    /**
     * ����ɾ�� Map �е�ӳ��
     * @param args
     */
    public void testRemove() {
        //��ȡ�Ӽ�������Ĵ�ɾ���γ� ID �ַ���
        Scanner console = new Scanner(System.in);
        while(true){
            //��ʾ�����ɾ���Ŀγ� ID
            System.out.println("������Ҫɾ���Ŀγ� ID��");
            String ID = console.next();
            //�жϸ� ID �Ƿ��Ӧ�Ŀγ̶���
            Course cr = courses.get(ID);
            if(cr == null) {
                //��ʾ����� ID ��������
                System.out.println("�� ID �����ڣ�");
                continue;
            }
            courses.remove(ID);
            System.out.println("�ɹ�ɾ���γ�" + cr.name);
            break;
        }
    }

    /**
     * ͨ�� entrySet ���������� Map
     * @param args
     */
    public void testEntrySet() {
        //ͨ�� entrySet ���������� Map �е����м�ֵ��
        Set<Entry<String,Course>> entrySet = courses.entrySet();
        for(Entry<String,Course> entry: entrySet) {
            System.out.println("ȡ�ü���" + entry.getKey());
            System.out.println("��Ӧ��ֵΪ��" + entry.getValue().name);
        }
    }

    /**
     * ���� put �����޸�Map �е�����ӳ��
     * @param args
     */
    public void testModify(){
        //��ʾ����Ҫ�޸ĵĿγ� ID
        System.out.println("������Ҫ�޸ĵĿγ� ID��");
        //����һ�� Scanner ����ȥ��ȡ�Ӽ���������Ŀγ� ID �ַ���
        Scanner console = new Scanner(System.in);
        while(true) {
            //ȡ�ôӼ�������Ŀγ� ID
            String crID = console.next();
            //�� courses �в��Ҹÿγ� ID ��Ӧ�Ķ���
            Course course = courses.get(crID);
            if(course == null) {
                System.out.println("�� ID �����ڣ����������룡");
                continue;
            }
            //��ʾ��ǰ��Ӧ�Ŀγ̶��������
            System.out.println("��ǰ�ÿγ� ID������Ӧ�Ŀγ�Ϊ��" + course.name);
            //��ʾ�����µĿγ����ƣ����޸����е�ӳ��
            System.out.println("�������µĿγ����ƣ�");
            String name = console.next();
            Course newCourse = new Course(crID,name);
            courses.put(crID, newCourse);
            System.out.println("�޸ĳɹ���");
            break;
        }
    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
        mt.testRemove();
        mt.testModify();
        mt.testEntrySet();

    }
}