package new1;
public class StringBuilderTest {

    public static void main(String[] args){
        //����ͳ�ʼ��һ��StringBuilder����ִ�s
        StringBuilder s = new StringBuilder("I");
        //��s��������ִ�" java"
        s.append(" java");
        //��s[1]��λ�ò����ִ�
        s.insert(1, " love");
        String t = s.toString(); //תΪ�ַ���
        System.out.println(t);
        
        StringBuilder s1 = new StringBuilder("I");
        s1.append(" python");
        s1.insert(1, " love");
        s1.insert(1, " greatly");
        s1.insert(3, " it ");
        s1.insert(8, " it ");
        System.out.println(s1);
    }
}