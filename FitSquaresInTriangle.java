package codechef;
import java.util.Scanner;
public class FitSquaresInTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
        	int n=sc.nextInt();
        	n=n/2;
        	n--;
        	System.out.println((n*(n+1))/2);
        }
	}

}
