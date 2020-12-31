package arrays;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int marks[]=new int[n];
       for(int i=0;i<n;i++) {
    	   marks[i]=sc.nextInt();
       }
       int avgMarks=0;
       for(int i=0;i<n;i++) {
    	   avgMarks +=marks[i];
       }
       avgMarks/=n;
       System.out.println("The average marks are "+avgMarks);
	}

}
