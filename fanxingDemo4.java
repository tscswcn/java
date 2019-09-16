package new1;

public class fanxingDemo4 {
	
	    public static void main(String[] args){
	        point4 p = new point4();  // 类型擦除
	        p.setX(10);
	        p.setY(20.8);
	        int x = (Integer)p.getX();  // 向下转型
	        double y = (Double)p.getY();
	        System.out.println("This point4 is：" + x + ", " + y);
	        //System.out.println(getMax(1,12.887));
	    }

	    public <T extends Number> T getMax(T array[]){
	        T max = null;
	        for(T element : array){
	            max = element.doubleValue() > max.doubleValue() ? element : max;
	        }
	        return max;
	    }
	    
}

	class point4<T1, T2>{
	    T1 x;
	    T2 y;
	    public T1 getX() {
	        return x;
	    }
	    public void setX(T1 x) {
	        this.x = x;
	    }
	    public T2 getY() {
	        return y;
	    }
	    public void setY(T2 y) {
	        this.y = y;
	    }
	}
