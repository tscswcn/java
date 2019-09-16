package new1;

public class fanxingDemo3 {
 /*  泛型方法
	public static <V1, V2> void printPoint(V1 x, V2 y){
    V1 m = x;
    V2 n = y;
    System.out.println("This point is：" + m + ", " + n);
}    
 */	
	public static void main(String arsg[]) {
	        Info<String> obj = new InfoImp<String>("www.weixueyuan.net");
	        System.out.println("Length Of String: " + obj.getVar().length());
	    }
	}

	//定义泛型接口
	interface Info<T> {
	    public T getVar();
	}

	//实现接口
	class InfoImp<T> implements Info<T> {
	    private T var;

	    // 定义泛型构造方法
	    public InfoImp(T var) {
	        this.setVar(var);
	    }

	    public void setVar(T var) {
	        this.var = var;
	    }

	    public T getVar() {
	        return this.var;
	    }
	}
