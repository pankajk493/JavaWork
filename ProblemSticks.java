package codechef;
import java.util.*;
public class ProblemSticks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0) {
    	   int n=sc.nextInt();
    	   int[] a=new int[n];
    	   int find=0;
    	   Set<Integer> x=new HashSet<>();
    	   x.clear();
    	   for(int i=0;i<n;i++) {
    		   a[i]=sc.nextInt();
    		   if(a[i]==0) 
    			   find=1;
    			   x.add(a[i]);
    	   }
    	   if(find==0) System.out.println(x.size());
    	   else System.out.println(x.size()-1);
       }
	}
}
