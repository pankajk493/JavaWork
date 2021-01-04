package patterns;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           for(int i=1;i<=n;i++) {
        	   for(int j=i-1;j<=1;j++) {
        		   System.out.print(" ");
        	   }
        	   for(int k=n-i+1;k<=1;k++) {
        		   System.out.print("*");
        	   }
        	   System.out.println();
           }

	}

}
