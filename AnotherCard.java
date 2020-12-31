package codechef;
import java.util.*;
import java.lang.Math; 

public class AnotherCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0) {
    	   int a=sc.nextInt();
    	   int b=sc.nextInt();
    	   int cpc=(int)Math.ceil((a*1.0)/9);
    	   int cpr=(int)Math.ceil((b*1.0)/9);
    	   //System.out.println(cpc+" "+cpr);
    	   if(cpc==cpr) {
    		   System.out.println("1"+" "+cpc);
    	   }
    	   else if(cpc>cpr) {
    		   System.out.println("1"+" "+cpr);
    	   }
    	   else {
    		   System.out.println("0"+" "+cpc);
    	   }
       }
	}

}
