package college;
import java.util.*;
public class Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      //double n1=sc.nextDouble();
      //double n2=sc.nextDouble();
      //double ans=n1*n2;
      //System.out.println(ans);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++) {
      System.out.println(arr[i]);}
	}
}
