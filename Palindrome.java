package loops;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int rev=0,a;
      for(int i=0;i<n;i++) {
    	  a=n%10;
    	  n=n/10;
    	  rev=rev*10+a;
      }
      System.out.println(rev);
      if(n==rev)System.out.println("Number is palindrome");
      else System.out.println("Not Palindrome");
	}

}
