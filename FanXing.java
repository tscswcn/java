package new1;


	/*
	ʹ��T�������ͣ����ۺ�ʱ��û�б���������������������������ж�����Ͳ��������ǿ���ʹ����ĸ����T���ٽ�����ĸ������S��
	*/
	class Test<T> {
	    private T ob;

	    /*
	    ���巺�ͳ�Ա���������������Ͳ����󣬿����ڶ���λ��֮��ķ���������ط�ʹ�����Ͳ���������ʹ����ͨ������һ����
	    ע�⣬���ඨ������Ͳ������ܱ�����̳С�
	    */

	    //���캯��
	    public Test(T ob) {
	        this.ob = ob;
	    }

	    //getter ����
	    public T getOb() {
	        return ob;
	    }


	    //setter ����
	    public void setOb(T ob) {
	        this.ob = ob;
	    }

	    public void showType() {
	        System.out.println("T��ʵ��������: " + ob.getClass().getName());
	    }
	}

	public class FanXing {
	    public static void main(String[] args) {
	        // ���巺���� Test ��һ��Integer�汾
	        Test<Integer> intOb = new Test<Integer>(88);
	        intOb.showType();
	        int i = intOb.getOb();
	        System.out.println("value= " + i);
	        System.out.println("----------------------------------");
	        // ���巺����Test��һ��String�汾
	        Test<String> strOb = new Test<String>("Hello Gen!");
	        strOb.showType();
	        String s = strOb.getOb();
	        System.out.println("value= " + s);
	        
	        Test<Double> douOb = new Test<Double>(88.99999);
	        douOb.showType();
	        double j = douOb.getOb();
	        System.out.println("value= " + j);
	        System.out.println("----------------------------------");
	        
	        
	        
	        
	        
	    }
	}
	