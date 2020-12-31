package college;
import java.util.*;
public class PrevNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      int[] Prev=new int[n];
      int[] Next=new int[n];
      
      for(int i=1;i<n;i++) {
    	  Prev[i]=Prev[i-1]+arr[i-1];
      }
      for(int i=n-2;i>=0;i--) {
    	  Next[i]=Next[i+1]+arr[i+1];
      }
      for(int i=0;i<n;i++) {
    	  if(Prev[i]==Next[i]) {
    		  System.out.println(i);
    	  }else {
    		  System.out.println("Not Present");
    	  }
      }
	}
}
