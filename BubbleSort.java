package arrays;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        //long start=System.currentTimeMillis();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<n-1;j++) {
        		if(a[j+1]<a[j]) {
        			int temp;
        			temp=a[j+1];
        			a[j+1]=a[j];
        			a[j]=temp;
        			sorted=false;
        		}
        	}
        	if(sorted) break;
        }
        for(int item:a) {
        	System.out.print(item+" ");
        }
	}
}
