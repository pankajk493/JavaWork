package college;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean leapYear=false;
        if(year%4==0) {
        	if(year%100==0) {
        		if(year%400==0) {
        			leapYear=true;
        		}else {
        			leapYear=false;
        		}
        	}else {
    			leapYear=true;
    		}
        }else {
        	leapYear=false;
        }
        if(leapYear) {
        	System.out.println("Leap year:"+year);
        }else {
        	System.out.println("Not a leap year:"+year);
        }
	}

}
