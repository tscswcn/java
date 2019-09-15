package new1;

public class CreateThread {


	
	
	public static void main(String[] args) throws InterruptedException
    {
        Thread1 thread1 = new Thread1();
        //声明一个Thread1对象，这个Thread1类继承自Thread类的

        Thread thread2 = new Thread(new Thread2());
        //传递一个匿名对象作为参数

        //Thread1 thread11 = new Thread1();
        //声明一个Thread1对象，这个Thread1类继承自Thread类的

        //Thread thread12 = new Thread(new Thread2());
        //传递一个匿名对象作为参数
        
        Thread thread3 = new Thread(new Thread3());
        //传递一个匿名对象作为参数

        thread3.start();
        thread1.start();
        thread2.start();
        //启动线程
        
        thread1.sleep(5000);  
        System.out.print("sleeping");
        thread1.sleep(5000);
        System.out.print("sleeping");
    }
}

class Thread1 extends Thread
{
    public void run()
    {
        //在run()方法中放入线程要完成的工作

        //这里我们把两个线程各自的工作设置为打印100次信息
        for (int i = 0; i < 100; ++i)
        {
            System.out.println("Hello! Thread1 This is " + i);
        }

        //在这个循环结束后，线程便会自动结束
    }
}

class Thread2 implements Runnable {
    //与Thread1不同，如果当一个线程已经继承了另一个类时，就建议你通过实现Runnable接口来构造

    public void run()
    {
        for (int i = 0; i < 100; ++i)
        {
            System.out.println("Thanks.  Thread2  There is " + i);
        }
    }
    
}
class Thread3 implements Runnable {
    //与Thread1不同，如果当一个线程已经继承了另一个类时，就建议你通过实现Runnable接口来构造

    public void run()
    {
        for (int i = 0; i < 100; ++i)
        {
            System.out.println("Thanks.  Thread3  There is " + i);
        }
    }
}