public class Dog {

    int age;
    String name;
    String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;


    public Dog(int age,String name,String color,String type)
    {
     this.age=age;
     this.name=name;
     this.color=color;
     this.type=type;
    }

    public static void main (String args[]){
     Dog dog1=new Dog(1,"gougou1","red","tianyuanquan1");
     System.out.println(dog1.getAge()+dog1.getColor()+dog1.getName()+dog1.getType());
        Dog dog2=new Dog(2,"gougou2","blue","tianyuanquan2");
        System.out.println(dog2.getAge()+dog2.getColor()+dog2.getName()+dog2.getType());
        Dog dog3=new Dog(3,"gougou3","yellow","tianyuanquan3");
        System.out.println(dog3.getAge()+dog3.getColor()+dog3.getName()+dog3.getType());
        Dog dog4=new Dog(4,"gougou4","black","tianyuanquan4");
        System.out.println(dog4.getAge()+dog4.getColor()+dog4.getName()+dog4.getType());

    }
}

