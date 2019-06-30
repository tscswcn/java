public class Student {
    String name="";
    int age;
    int sno;
    /*
    public Student()
    {
     System.out.printf("没有参数");
    }
    */
    public Student(int age)
    {
        System.out.printf("age");
        this.age=age;
    }
    public Student(String name)
    {
        this.name=name;
        System.out.printf("name");
    }

    public Student() {

    }

    public int setAge(int age) {
        if (age<=130 && age>=0)
        this.age=age;
        else System.out.print("年龄在在0到130之间");
        return age;
    }
    public int getAge(int age) {

        return this.age;
    }

    public static void main(String args[])
 {
      Student student1=new Student(21);
      System.out.print(student1.age);
      Student student2=new Student("luopeng");
      System.out.printf(student2.name);
     Student student3=new Student();
     System.out.print(student3.age);
     System.out.println(student3.setAge(133));
 }

}
