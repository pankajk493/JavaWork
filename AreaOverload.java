package college;
public class AreaOverload {
	void area(int b,float h)
    {
        System.out.println("Area of the triangle is "+0.5*b*h+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("Area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("Area of the circle is "+z+" sq units");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AreaOverload ar= new AreaOverload();
		   ar.area(5,10);
		   ar.area(11,12);
		   ar.area(2.5);
	}
}
