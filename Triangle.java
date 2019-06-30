public class Triangle {
    public double base;
    public double height;
    public double area;

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public Triangle(double base,double height)

    {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(Triangle t)
    {
        double area=t.getBase()* t.getHeight();
        return area;
    }
    public void main(String args[])
    {
    }


}




public class TriangleManager
{
    public Triangle triangler;
    public double area;
    public TriangleManager(Triangle triangler)
    {
        this.triangler=triangler;
    }
    public double getArea(Triangle t)
    {
        this.triangler=t;
        double area=t.getBase()* t.getHeight();
        return area;
    }
    public static void main(String args[]) {
        Triangle t= new  Triangle(3.0,5.0);
        TriangleManager t1=new TriangleManager(t);
       System.out.print("sfsdfds"+t1.getArea(t));
    }

}
