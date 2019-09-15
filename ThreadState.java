package new1;

public class ThreadState implements Runnable {

    public synchronized void waitForAMoment() throws InterruptedException {

        wait(500); 
        //ʹ��wait()����ʹ��ǰ�̵߳ȴ�500����
        //���ߵȴ������̵߳���notify()��notifyAll()����������
    }

    public synchronized void waitForever() throws InterruptedException {

        wait(); 
        //������ʱ�����ζ��ʹ��ǰ�߳����õȴ���
        //ֻ�ܵȵ������̵߳���notify()��notifyAll()�������ܻ���
    }

    public synchronized void notifyNow() throws InterruptedException {

        notify(); 
        //ʹ��notify()������������Щ��Ϊ������wait()����������ȴ�״̬���߳�
    }

    public void run() {

        //�������쳣������Ϊ�˷�ֹ���ܵ��ж��쳣
        //����κ��߳��ж��˵�ǰ�̣߳����׳����쳣

        try {
            waitForAMoment(); 
            // �����߳�������waitMoment()����

            waitForever(); 
            // �����߳�������waitForever()����

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}