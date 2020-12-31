package codechef;
import java.util.*;
public class TotalExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
        	int quantity=sc.nextInt();
        	int price=sc.nextInt();
        	if(quantity<=1000) {
        		float bill=quantity*price;
        		System.out.println(bill);
        	}
        	else {
        		quantity=quantity/10;
        		float bill=quantity*price;
        		System.out.println(bill);
        	}
        }
	}

}
