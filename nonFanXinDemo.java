package new1;

public class nonFanXinDemo {

	    public static void main(String[] args){
	        Point p = new Point();

	        p.setX(10);  // int -> Integer -> Object
	        p.setY(20);
	        int x = (Integer)p.getX();  // ��������ת��
	        int y = (Integer)p.getY();
	        System.out.println("This point is��" + x + ", " + y);

	        p.setX(25.4);  // double -> Integer -> Object
	        p.setY("����180��");
	        double m = (Double)p.getX();  // ��������ת��
	        double n = (Double)p.getY();  // �����ڼ��׳��쳣
	        System.out.println("This point is��" + m + ", " + n);
	    }
	}

	class Point{
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