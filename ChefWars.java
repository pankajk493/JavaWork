package codechef;
import java.util.*;
public class ChefWars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0) {
    	   int h=sc.nextInt();
    	   int p=sc.nextInt();
    	  // if(h>p) {
    		    while(p>0 && h>p){
        		   h=h-p;
        		   p=p/2;
        		   
        	   } 
    		   if(p<h || p==0) {
    		   System.out.println("0");}
    		   else {
    			   System.out.println("1");
    		   }
        	
    	   }
    	  // else {
    		//   System.out.println("1");
    	   //}
    		   
    	   
       }
	//}

}
