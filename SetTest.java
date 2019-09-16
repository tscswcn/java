package new1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Set;
/*
 * 项目组长类
 */
 class PD {

    public String id;
    public String name;
    //集合后面的<>代表泛型的意思
    //泛型是规定了集合元素的类型
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
     * 用于往Student1s中添加学生
     */
    public void testAdd() {
        //创建一个学生对象，并通过调用add方法，添加到学生管理List中
        Student1 st1 = new Student("1", "张三");
        student1s.add(st1);

        //添加到List中的类型均为Object，所以取出时还需要强转

        Student st2 = new Student("2","李四");
        Student1s.add(st2);

        Student[] student = {new Student("3", "王五"),new Student("4", "马六")};
        Student1s.addAll(Arrays.asList(student));

        Student[] student2 = {new Student("5", "周七"),new Student("6", "赵八")};
        Student1s.addAll(Arrays.asList(student2));

    }

    /**
     * 通过for each 方法访问集合元素
     * @param args
     */
    public void testForEach() {
        System.out.println("有如下学生（通过for each）：");
        for(Object obj:Student1s){
            Student st = (Student)obj;
            System.out.println("学生：" + st.id + ":" + st.name);
        }
    }

    public static void main(String[] args){
        SetTest st = new SetTest();
        st.testAdd();
        st.testForEach();
        PD pd = new PD("1","张老师");
        System.out.println("请：" + pd.name + "选择小组成员！");
        //创建一个 Scanner 对象，用来接收从键盘输入的学生 ID
        Scanner console = new Scanner(System.in);

        for(int i = 0;i < 3; i++){
            System.out.println("请输入学生 ID");
            String studentID = console.next();
            for(Student1 s:st.student1s){
                if(s.id.equals(studentID)){
                    pd.student1s.add(s);
                }
            }
        }
        st.testForEachForSer(pd);
        // 关闭 Scanner 对象
        console.close();
    }
    //打印输出，老师所选的学生！Set里遍历元素只能用foreach 和 iterator 
    //不能使用 get() 方法，因为它是无序的，不能想 List 一样查询具体索引的元素
    public void testForEachForSer(PD pd){
        for(Student1 s: pd.student1s) {
        System.out.println("选择了学生：" + s.id + ":" + s.name);
        }
    }

}