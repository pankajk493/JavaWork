package codechef;
import java.util.Scanner;
public class LinearChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
        	int n=sc.nextInt();
        	int k=sc.nextInt();
        	int[] p=new int[n];
        	for(int i=0;i<n;i++) {
        		p[i]=sc.nextInt();
        		
        	}
        	for(int i=0;i<n;i++) {
        		int moves=0;
        		if(p[i]==k) System.out.println(p[i]);
        		//int now=0,previous=0;
                if(p[i]+p[i]==k) {
                	
                	System.out.println(p[i]);      
                	moves++;
                }
        	}
        	
        	
        }
	}

}
