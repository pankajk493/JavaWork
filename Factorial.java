package loops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
       int e=1;
       for(int i=n;i>=1;i--) {
    	   e=e*i;
       }
       System.out.println(e);
	}

}
