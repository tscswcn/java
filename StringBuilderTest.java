package new1;
public class StringBuilderTest {

    public static void main(String[] args){
        //定义和初始化一个StringBuilder类的字串s
        StringBuilder s = new StringBuilder("I");
        //在s后面添加字串" java"
        s.append(" java");
        //在s[1]的位置插入字串
        s.insert(1, " love");
        String t = s.toString(); //转为字符串
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