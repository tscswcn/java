package new1;

//People.java
//�ⲿ��People
public class People {
 private String name = "LiLei";         //�ⲿ���˽������
 //�ڲ���Student
 public class Student {
     String ID = "20151234";               //�ڲ���ĳ�Ա����
     //�ڲ���ķ���
     public void stuInfo(){
         System.out.println("�����ⲿ���е�name��" + name);
         System.out.println("�����ڲ����е�ID��" + ID);
     }
 }

 //���Գ�Ա�ڲ���
 public static void main(String[] args) {
     People a = new People();     //�����ⲿ����󣬶�����Ϊa
     Student b = a.new Student(); //ʹ���ⲿ����󴴽��ڲ�����󣬶�����Ϊb
     // ����Ϊ People.Student b = a.new Student();
     b.stuInfo();   //�����ڲ������suInfo����
 }
}