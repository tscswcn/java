package new1;

public class fanxingDemo3 {
 /*  ���ͷ���
	public static <V1, V2> void printPoint(V1 x, V2 y){
    V1 m = x;
    V2 n = y;
    System.out.println("This point is��" + m + ", " + n);
}    
 */	
	public static void main(String arsg[]) {
	        Info<String> obj = new InfoImp<String>("www.weixueyuan.net");
	        System.out.println("Length Of String: " + obj.getVar().length());
	    }
	}

	//���巺�ͽӿ�
	interface Info<T> {
	    public T getVar();
	}

	//ʵ�ֽӿ�
	class InfoImp<T> implements Info<T> {
	    private T var;

	    // ���巺�͹��췽��
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
