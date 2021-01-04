package loops;
import java.util.*;
public class Prime {
	static void printPrimeNumbers(int n)  
	{  
	    int i, j, flag;  
	    System.out.println("Prime numbers:");  
	    for (i = 1; i <= n; i++)  
	    {  
	        if (i == 1 || i == 0)  
	            continue;  
	        flag = 1;  
	        for (j = 2; j <= i / 2; ++j)  
	        {  
	            if (i % j == 0) 
	            {  
	                flag = 0;  
	                break;  
	            }  
	        }   
	        if (flag == 1)  
	            System.out.print(i + " ");  
	    }  
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 50;  
		  
		    printPrimeNumbers(n);  
	}

}
