package codechef;
import java.util.*;
public class Oct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0) {
       	  int n=sc.nextInt();
       	 long k=sc.nextLong();
       	 int [] arr=new int[n];
       	 for(int i=0;i<n;i++) {
       		 arr[i]=sc.nextInt();
       	 }        		
       	 long total=0,left=0,count=0;
       	 boolean flag = true;
       	 for(int i=0;i<n;i++) {
       		 total=arr[i]+left;
       		 if(total>=k) {
       			 left=total-k;
       			 count++;
       		 }else if(total<k) {
       			 flag = false;
       			 break;
       		 }
       	 }
       	 if(flag == true) {
       		 //System.out.println(left);
       		 count += (left/k);
       		 
       	 }
       	 System.out.println(count+1);
        }
         
	}
  }

