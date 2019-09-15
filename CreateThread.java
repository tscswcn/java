package new1;

public class CreateThread {


	
	
	public static void main(String[] args) throws InterruptedException
    {
        Thread1 thread1 = new Thread1();
        //����һ��Thread1�������Thread1��̳���Thread���

        Thread thread2 = new Thread(new Thread2());
        //����һ������������Ϊ����

        //Thread1 thread11 = new Thread1();
        //����һ��Thread1�������Thread1��̳���Thread���

        //Thread thread12 = new Thread(new Thread2());
        //����һ������������Ϊ����
        
        Thread thread3 = new Thread(new Thread3());
        //����һ������������Ϊ����

        thread3.start();
        thread1.start();
        thread2.start();
        //�����߳�
        
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
        //��run()�����з����߳�Ҫ��ɵĹ���

        //�������ǰ������̸߳��ԵĹ�������Ϊ��ӡ100����Ϣ
        for (int i = 0; i < 100; ++i)
        {
            System.out.println("Hello! Thread1 This is " + i);
        }

        //�����ѭ���������̱߳���Զ�����
    }
}

class Thread2 implements Runnable {
    //��Thread1��ͬ�������һ���߳��Ѿ��̳�����һ����ʱ���ͽ�����ͨ��ʵ��Runnable�ӿ�������

    public void run()
    {
        for (int i = 0; i < 100; ++i)
        {
            System.out.println("Thanks.  Thread2  There is " + i);
        }
    }
    
}
class Thread3 implements Runnable {
    //��Thread1��ͬ�������һ���߳��Ѿ��̳�����һ����ʱ���ͽ�����ͨ��ʵ��Runnable�ӿ�������

    public void run()
    {
        for (int i = 0; i < 100; ++i)
        {
            System.out.println("Thanks.  Thread3  There is " + i);
        }
    }
}