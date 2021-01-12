package PepCoding;
import java .util.*;
public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int div=2;div*div<=n;div++) {
			while(n%div==0) {
				n=n/div;
				System.out.print(div+" ");
			}
		}
		if(n!=1) {
			System.out.print(n);
		}
	}

}
