package oops;
class Vehicle{
	int wheels;
	int headlights;
	String color;
	Vehicle(int wheels){
		this.wheels=wheels;
		headlights=2;
	}
	Vehicle(int wheels,String color){
		this.wheels=wheels;
		this.color=color;
		headlights=2;
	}
}


public class MyConstructor {
	
	MyConstructor(){
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // MyConstructor obj=new MyConstructor();
		Vehicle car=new Vehicle(4);
		Vehicle scooty=new Vehicle(2);
        Vehicle car2=new Vehicle(6,"yellow");
		System.out.println(scooty.wheels+" wheels and color= "+ car2.color);
	}

}
