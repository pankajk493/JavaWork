package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;
class Reader{
	BufferedReader reader;
	Reader(){
		reader=new BufferedReader(new InputStreamReader(System.in));
	}
	int nextInt() throws IOException{
		String in=reader.readLine().trim();
		return Integer.parseInt(in);
	}
	long nextLong() throws IOException{
		String in=reader.readLine().trim();
		return Long.parseLong(in);
	}
	String next() throws IOException{
		return reader.readLine().trim();
	}
	String[] stringArray() throws IOException{
		return reader.readLine().trim().split("\\s+");
	}
	int[] intArray() throws IOException{
		String[] inp=this.stringArray();
		int[] arr=new int[inp.length];
		int i=0;
		for(String s:inp) {
			arr[i++]=Integer.parseInt(s);
		}
		return arr;
	}

public class Posand {
	
	
	public void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Reader sc=new Reader();
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
      int t=sc.nextInt();
      while(t-->0) {
int n=sc.nextInt();
    	  
    	  if(n==1) {
    		  writer.write("1\n");
    		  continue;
    	  }
    	  else if(n==3) {
    		  writer.write("1"+" "+"3"+" "+"2\n");
    		  continue;
    	  }
    	  else if(n==5) {
    		  writer.write("2"+" "+"3"+" "+"1"+" "+"5"+" "+"4\n");
    		  continue;
    	  }
    	  else if((n&(n-1))==0) {
    		  writer.write("-1\n");
    		  continue;
    	  }
    	  else {
    		  writer.write("2"+" "+"3"+" "+"1"+" "+"5"+" "+"4"+" ");
    		  int i=6;
    		  while(i<=n) {
    			  if((i&(i-1))==0) {
    				  writer.write((i+1)+" "+i+" ");
    				  i+=2;
    			  }else {
    				  writer.write(i+" ");
    				  i++;
    			  }
    		  }
    		  writer.write("\n");
    		  
    	  }
    	  writer.close();}
      }
}
}
