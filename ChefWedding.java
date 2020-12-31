package codechef;
import java.util.*;
public class ChefWedding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0) {
    	   int n=sc.nextInt();
    	   int k=sc.nextInt();
    	   int[] arr=new int[n];
    	   int[] family=new int[105];
    	   for(int i=0;i<n;i++) {
    		   arr[i]=sc.nextInt();   
    	   }
    	   int count=1;
    	   ArrayList<Integer> table=new ArrayList<>();
    	   
    	   for(int i=0;i<n;i++) {
    		   family[arr[i]]++;
    		   if(table.contains(arr[i])) {
    			   table.clear();
    			   count++;
    			   table.add(arr[i]);
    		   }else { 
    			   table.add(arr[i]);
    		   }
    	   }
    	   int argue=0;
    	   for(int i:family) {
    		   if(i>1) {
    			   argue+=i;
    		   }
    	   }
    	   if((count*k)>(argue+k))
    		   System.out.println((argue+k));
    	   else
    		   System.out.println((count*k));
    	   Arrays.fill(family, 0);
	}
	}
	}
