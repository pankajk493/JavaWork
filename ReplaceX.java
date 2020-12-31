package codechef;
import java.util.*;
public class ReplaceX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int c=sc.nextInt();
       while(c-->0) {
    	   int n=sc.nextInt();
    	   int X=sc.nextInt();
    	   int p=sc.nextInt();
    	   int k=sc.nextInt();
    	   int count=0,s=0;
    	   int[] arr=new int[n+1];
    	   for(int i=1;i<n+1;i++) {
    		   arr[i]=sc.nextInt();
    	   }
    	   Arrays.sort(arr);
    	   boolean flag=false;
    	   if(n==1){
    		   if(X==arr[1]) System.out.println("0");else System.out.println("1");}
    	   else if(arr[p]==X) System.out.println("0");
    	   else if(k<p && X>=arr[p]){
    	     for(int i=1;i<n+1;i++){
    	       if(arr[i]==X){
    	    	   s=i;
    	    	   flag=true;
    	    	   break;
    	    	   }
    	     }
    	     if(flag==true){
    	       count = s-p;
    	       
    	       System.out.println(count);
    	     }
    	     else{
    	       arr[k]=X;
    	       Arrays.sort(arr);
    	       for(int i=1;i<n+1;i++){
    	         if(arr[i]==X){
    	        	 s=i;
    	        	 break;
    	        	 }
    	       }
    	       count = s-p+1;
    	       System.out.println(count);
    	     }
    	   }
    	   else if(k>p && X<=arr[p]){
    	     for(int i=n;i>0;i--){
    	       if(arr[i]==X){
    	    	   s=i;
    	    	   flag=true;
    	    	   break;
    	    	   }
    	     }
    	     if(flag==true){
    	    	 count=p-s;
    	    	 System.out.println(count);
    	    	 }
    	     else{
    	       arr[k]=X;
    	       Arrays.sort(arr);
    	       for(int i=n;i>0;i--){
    	         if(arr[i]==X){
    	        	 s=i;
    	        	 break;
    	        	 }
    	       }
    	       count = p-s+1;
    	       System.out.println(count);
    	     }
    	   }
    	   else if(k==p){
    	     for(int i=1;i<n+1;i++){
    	       if(arr[i]==X){
    	    	   flag =true;
    	    	   break;
    	    	   }
    	     }
    	     if(flag==true){
    	       if(arr[p]==X)System.out.println("1");
    	       else if(arr[p]>=X){
    	         for(int i=n;i>0;i--){
    	           if(arr[i]==X){
    	        	   s=i;
    	        	   break;
    	        	   }
    	         }
             System.out.println(p-s);    	       }
    	       else if(arr[p]<=X){
    	         for(int i=1;i<n+1;i++){
    	           if(arr[i]==X){
    	        	   s=i;
    	        	   break;
    	        	   }
    	         }
             System.out.println(s-p);    	       
             }
    	     }
    	     else{
    	       arr[k]=X;
    	       Arrays.sort(arr);
    	       if(arr[p]>=X){
    	         for(int i=n;i>0;i--){
    	           if(arr[i]==X){
    	        	   s=i;
    	        	   break;
    	        	   }
    	         }
                    System.out.println(p-s+1);    	       
                    }
    	       else if(arr[p]<=X){
    	         for(int i=1;i<n+1;i++){
    	           if(arr[i]==X){
    	        	   s=i;
    	        	   break;
    	        	   }
    	         }
               System.out.println(s-p+1);    	       
               }
    	     }
    	   }

    	   else System.out.println("-1");    		   
    	   }
    	   
       }
	}

