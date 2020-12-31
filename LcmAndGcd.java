package codechef;
import java.util.*;
public class LcmAndGcd {
	
	public static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}
      public static int lcm(int a,int b) {
    	  return ((a*b)/gcd(a,b));
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.print(gcd(a,b)+" "+lcm(a,b));
		}

	}

}
