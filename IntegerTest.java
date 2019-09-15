package new1;

public class IntegerTest {
    public static void main(String[] args){
        //初始化一个 Integer 类实例
        Integer a = new Integer("10");
        //初始化一个 Integer 类实例
        Integer b = new Integer(11);
        //判断两个数的大小
        System.out.println(a.compareTo(b));
        // 判断两个实例是否相等
        System.out.println(a.equals(b));
        //将 a 转换成 float 型数
        float c = a.floatValue();
        System.out.println(c);

        String d = "10101110";
        //将字符串转换为数值
        //parseInt(String str) 和 parseInt(String str,int radix) 都是类方法，由类来调用。后一个方法则实现将字符串按照参数 radix 指定的进制转换为 int，
        int e = Integer.parseInt(d, 2);
        System.out.println(e);
        
        String d2 = "10101110";
        //将字符串转换为数值
        //parseInt(String str) 和 parseInt(String str,int radix) 都是类方法，由类来调用。后一个方法则实现将字符串按照参数 radix 指定的进制转换为 int，
        int e2 = Integer.parseInt(d2, 3);
        System.out.println(e2);
    
        String d3 = "100";
        //将字符串转换为数值
        //parseInt(String str) 和 parseInt(String str,int radix) 都是类方法，由类来调用。后一个方法则实现将字符串按照参数 radix 指定的进制转换为 int，
        int e3 = Integer.parseInt(d3, 16);
        System.out.println(e3);
        
        int count;
        //定义了一个字符数组
        char[] values = {'*', '_', '%', '8', 'L', 'l'};
        //遍历字符数组
        for (count = 0; count < values.length; count++){
            if(Character.isDigit(values[count])){
                System.out.println(values[count]+"是一个数字");
            }
            if(Character.isLetter(values[count])){
                System.out.println(values[count]+ "是一个字母");
            }
            if(Character.isUpperCase(values[count])){
                System.out.println(values[count]+"是大写形式");
            }
            if(Character.isLowerCase(values[count])){
                System.out.println(values[count]+"是小写形式");
            }
            if(Character.isUnicodeIdentifierStart(values[count])){
                System.out.println(values[count]+"是Unicode标志符的第一个有效字符");
            }
        }
        //判断字符c是否是空白字符
        char c1 = ' ';
        System.out.println("字符c是空白字符吗？"+Character.isWhitespace(c1));
        
        
        // Boolean(boolean value)构造方法
        Boolean ab = new Boolean(true);
        System.out.println("ab为"+ab);
        // Boolean(String s)构造方法
        Boolean bb = new Boolean("true");
        Boolean cb = new Boolean("OK");
        System.out.println("bb为"+bb);
        System.out.println("bc为"+cb);
        System.out.println("ab的booleanValue()为"+ab.booleanValue());
        System.out.println("ab和bb相等吗？"+ab.equals(bb));
        
        
        
        String s = new String("Java");
        String m = "java";
        System.out.println("用equals()比较，java和Java结果为"+s.equals(m));
        System.out.println("用equalsIgnoreCase()比较，java和Java结果为"+s.equalsIgnoreCase(m));
        
        String s0 = new String("Hello ");
        String s1 = "World" + "!";   //+号连接
        String s2 = s0.concat(s1); //concat()方法连接
        System.out.println(s2);
        
        String s11 = "abc";
        String s12 = "Java语言";
        int len1 = s11.length();
        int len2 = s12.length();
        System.out.println(len1+"字符长度"+len2);
        
        String s22 = "字符abc";
        char c221 = s22.charAt(1);
        char c222 = s22.charAt(0);
        char c223 = s22.charAt(2);
        System.out.println("String s22 = \"abc\";char c22 = s.charAt(1);"+c221+" "+c222+" "+c223+" ");
        
        String sz = "abcdefabc";
        System.out.println("字符a第一次出现的位置为"+sz.indexOf('a'));
        System.out.println("字符串bc第一次出现的位置为"+sz.indexOf("bc"));
        System.out.println("字符a最后一次出现的位置为"+sz.lastIndexOf('a'));
        System.out.println("从位置3开始到结束的字符串"+sz.substring(3));
        System.out.println("从位置3开始到6之间的字符串"+sz.substring(3,6));
        
        String sx = "Hello ";
        sx.concat("World!");   //字符串连接
        System.out.println(sx); //输出s，还是"Hello "
        sx = sx.concat("World!");  //把字符串对象连接的结果赋给了s引用
        System.out.println(sx);  //输出s，变成了"Hello World!"

        /*
        上述三条语句其实产生了3个String对象，"Hello "，"World!"，"Hello World!"。第2条语句确实产生了"Hello World"字符串，但是没有指定把该字符串的引用赋给谁，因此没有改变s引用。第3条语句根据不变性，并没有改变"Hello "，JVM创建了一个新的对象，把"Hello "，"World!"的连接赋给了s引用，因此引用变了，但是原对象没变。
        */
        
        StringBuffer sbuf = new StringBuffer("I");
        //在s后面添加字串" java"
        sbuf.append(" java");
        //在s[1]的位置插入字串
        sbuf.insert(1, " love");
        String t = sbuf.toString(); //转为字符串
        System.out.println(t);
        
        
        
        System.out.println(Math.abs(-12.7));
        System.out.println(Math.ceil(12.7));
        System.out.println(Math.rint(12.4));
        System.out.println(Math.random());
        System.out.println("sin30 = " + Math.sin(Math.PI / 6));
        // 计算30°的正弦值，参数是用弧度表示的角，即π的六分之一
        System.out.println("cos30 = " + Math.cos(Math.PI / 6));
        // 计算30°的余弦值，这些计算三角函数的方法，其参数和返回值的类型都为double
        System.out.println("tan30 = " + Math.tan(Math.PI / 6));
        // 计算30°的正切值
    }
    }
    
    
    
    
