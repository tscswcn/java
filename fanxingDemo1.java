package new1;

public class fanxingDemo1 {
	
	    public static void main(String[] args){
	        Point1 p = new Point1();

	        p.setX(10);  // int -> Integer -> Object
	        p.setY(20);
	        int x = (Integer)p.getX();  // ��������ת��
	        int y = (Integer)p.getY();
	        System.out.println("This Point1 is��" + x + ", " + y);

	        p.setX(25.4);  // double -> Integer -> Object
	        p.setY("����180��");
	        //�������´��� �����
	        //double m = (Double)p.getX();  // ��������ת��
	        //double n = (Double)p.getY();  // �����ڼ��׳��쳣
	        //System.out.println("This Point1 is��" + m + ", " + n);
	    }
	}

	class Point1{
	    Object x = 0;
	    Object y = 0;

	    public Object getX() {
	        return x;
	    }
	    public void setX(Object x) {
	        this.x = x;
	    }
	    public Object getY() {
	        return y;
	    }
	    public void setY(Object y) {
	        this.y = y;
	    }
	}