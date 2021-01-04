package maps;

public class HashCodeAndEquals {
	public static void main(String[] args) {
		 Pen pen1=new Pen(10,"blue");
		 Pen pen2=new Pen(10,"blue");
		 System.out.println(pen1);
      System.out.println(pen1.equals(pen2));
		 
	}
}
class Pen{
	int price;
	String color;
	public Pen(int price,String color) {
		this.price=price;
		this.color=color;
	}
	
}