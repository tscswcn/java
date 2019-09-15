package new1;

public class IntegerTest {
    public static void main(String[] args){
        //��ʼ��һ�� Integer ��ʵ��
        Integer a = new Integer("10");
        //��ʼ��һ�� Integer ��ʵ��
        Integer b = new Integer(11);
        //�ж��������Ĵ�С
        System.out.println(a.compareTo(b));
        // �ж�����ʵ���Ƿ����
        System.out.println(a.equals(b));
        //�� a ת���� float ����
        float c = a.floatValue();
        System.out.println(c);

        String d = "10101110";
        //���ַ���ת��Ϊ��ֵ
        //parseInt(String str) �� parseInt(String str,int radix) �����෽�������������á���һ��������ʵ�ֽ��ַ������ղ��� radix ָ���Ľ���ת��Ϊ int��
        int e = Integer.parseInt(d, 2);
        System.out.println(e);
        
        String d2 = "10101110";
        //���ַ���ת��Ϊ��ֵ
        //parseInt(String str) �� parseInt(String str,int radix) �����෽�������������á���һ��������ʵ�ֽ��ַ������ղ��� radix ָ���Ľ���ת��Ϊ int��
        int e2 = Integer.parseInt(d2, 3);
        System.out.println(e2);
    
        String d3 = "100";
        //���ַ���ת��Ϊ��ֵ
        //parseInt(String str) �� parseInt(String str,int radix) �����෽�������������á���һ��������ʵ�ֽ��ַ������ղ��� radix ָ���Ľ���ת��Ϊ int��
        int e3 = Integer.parseInt(d3, 16);
        System.out.println(e3);
        
        int count;
        //������һ���ַ�����
        char[] values = {'*', '_', '%', '8', 'L', 'l'};
        //�����ַ�����
        for (count = 0; count < values.length; count++){
            if(Character.isDigit(values[count])){
                System.out.println(values[count]+"��һ������");
            }
            if(Character.isLetter(values[count])){
                System.out.println(values[count]+ "��һ����ĸ");
            }
            if(Character.isUpperCase(values[count])){
                System.out.println(values[count]+"�Ǵ�д��ʽ");
            }
            if(Character.isLowerCase(values[count])){
                System.out.println(values[count]+"��Сд��ʽ");
            }
            if(Character.isUnicodeIdentifierStart(values[count])){
                System.out.println(values[count]+"��Unicode��־���ĵ�һ����Ч�ַ�");
            }
        }
        //�ж��ַ�c�Ƿ��ǿհ��ַ�
        char c1 = ' ';
        System.out.println("�ַ�c�ǿհ��ַ���"+Character.isWhitespace(c1));
        
        
        // Boolean(boolean value)���췽��
        Boolean ab = new Boolean(true);
        System.out.println("abΪ"+ab);
        // Boolean(String s)���췽��
        Boolean bb = new Boolean("true");
        Boolean cb = new Boolean("OK");
        System.out.println("bbΪ"+bb);
        System.out.println("bcΪ"+cb);
        System.out.println("ab��booleanValue()Ϊ"+ab.booleanValue());
        System.out.println("ab��bb�����"+ab.equals(bb));
        
        
        
        String s = new String("Java");
        String m = "java";
        System.out.println("��equals()�Ƚϣ�java��Java���Ϊ"+s.equals(m));
        System.out.println("��equalsIgnoreCase()�Ƚϣ�java��Java���Ϊ"+s.equalsIgnoreCase(m));
        
        String s0 = new String("Hello ");
        String s1 = "World" + "!";   //+������
        String s2 = s0.concat(s1); //concat()��������
        System.out.println(s2);
        
        String s11 = "abc";
        String s12 = "Java����";
        int len1 = s11.length();
        int len2 = s12.length();
        System.out.println(len1+"�ַ�����"+len2);
        
        String s22 = "�ַ�abc";
        char c221 = s22.charAt(1);
        char c222 = s22.charAt(0);
        char c223 = s22.charAt(2);
        System.out.println("String s22 = \"abc\";char c22 = s.charAt(1);"+c221+" "+c222+" "+c223+" ");
        
        String sz = "abcdefabc";
        System.out.println("�ַ�a��һ�γ��ֵ�λ��Ϊ"+sz.indexOf('a'));
        System.out.println("�ַ���bc��һ�γ��ֵ�λ��Ϊ"+sz.indexOf("bc"));
        System.out.println("�ַ�a���һ�γ��ֵ�λ��Ϊ"+sz.lastIndexOf('a'));
        System.out.println("��λ��3��ʼ���������ַ���"+sz.substring(3));
        System.out.println("��λ��3��ʼ��6֮����ַ���"+sz.substring(3,6));
        
        String sx = "Hello ";
        sx.concat("World!");   //�ַ�������
        System.out.println(sx); //���s������"Hello "
        sx = sx.concat("World!");  //���ַ����������ӵĽ��������s����
        System.out.println(sx);  //���s�������"Hello World!"

        /*
        �������������ʵ������3��String����"Hello "��"World!"��"Hello World!"����2�����ȷʵ������"Hello World"�ַ���������û��ָ���Ѹ��ַ��������ø���˭�����û�иı�s���á���3�������ݲ����ԣ���û�иı�"Hello "��JVM������һ���µĶ��󣬰�"Hello "��"World!"�����Ӹ�����s���ã�������ñ��ˣ�����ԭ����û�䡣
        */
        
        StringBuffer sbuf = new StringBuffer("I");
        //��s��������ִ�" java"
        sbuf.append(" java");
        //��s[1]��λ�ò����ִ�
        sbuf.insert(1, " love");
        String t = sbuf.toString(); //תΪ�ַ���
        System.out.println(t);
        
        
        
        System.out.println(Math.abs(-12.7));
        System.out.println(Math.ceil(12.7));
        System.out.println(Math.rint(12.4));
        System.out.println(Math.random());
        System.out.println("sin30 = " + Math.sin(Math.PI / 6));
        // ����30�������ֵ���������û��ȱ�ʾ�Ľǣ����е�����֮һ
        System.out.println("cos30 = " + Math.cos(Math.PI / 6));
        // ����30�������ֵ����Щ�������Ǻ����ķ�����������ͷ���ֵ�����Ͷ�Ϊdouble
        System.out.println("tan30 = " + Math.tan(Math.PI / 6));
        // ����30�������ֵ
    }
    }
    
    
    
    
