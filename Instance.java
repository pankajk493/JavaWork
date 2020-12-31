package college;
import java.util.*;
public class Instance {

	 public static class Person {
	        public String name;
	        public int age;
	        public int salary;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Person p = new Person();
		System.out.println("Please enter Name,Age and Salary");
		p.name = scan.nextLine();
		p.age = scan.nextInt();
		p.salary = scan.nextInt();

		System.out.println("The Name,Age and Salary are");
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.salary);

		scan.close();
	}

}
