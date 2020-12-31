package codechef;
import java.util.*;
public class ChefAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0) {
    	  int n=sc.nextInt();
    	  long arr[]=new long[n];
    	  for(int i=0;i<n;i++) {
    		  arr[i]=sc.nextLong();
    		 
    	  }
          long sum=0;
    	  for(int i=0;i<n;i++) {

    		  sum +=Math.abs(arr[i+1]-arr[i])-1;;
    	  }
    	  System.out.println(sum);
      }
	}

}
