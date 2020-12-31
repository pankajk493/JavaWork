package college;

public class OverRiding {
	void run(){
		System.out.println("Vehicle is running");
		}  
}
class Car extends OverRiding{  
	  public static void main(String args[]){  
	   
	 Car obj = new Car();  
	  
	  obj.run();  
	  }  
	}  
