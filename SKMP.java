package codechef;
import java.util.*;
public class SKMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.hasNextLine();
      while(t-->0) {
    	  String s1=sc.nextLine();String s = null;
    	  String s2=sc.nextLine();
    	 int n=s1.length();int m=s2.length();
    	 int[] al=new int[27];Arrays.fill(al, 0);
    	 int[] al1=new int[27];
    	 for(int i=0;i<n;i++) {
    		 al[s1.charAt(i)-'a']++;
    	 }
    	 for(int i=0;i<m;i++) {
    		 al[s2.charAt(i)-'a']--;
    	 }
    	 for(int i=0;i<26;i++) {
    		 al1[i]=al[i];
    	 }
    	 for(int i=0;i<=(s2.charAt(0)-'a');i++) {
    		 while(al[i]>0) {
    			 s+=(char)(i+97);
    			 al[i]--;
    		 }
    	 }
    	 s+=s2;
    	 for(int i=0;i<26;i++) {
    		 while(al[i]>0) {
    			 s+=(char)(i+97);
    			 al[i]--;
    		 }
    	 }
    	 String sf=null;
    	 for(int i=0;i<26;i++) {
    		 while(al1[i]!=0) {
    			 sf+=(char)(i+97);
    			 al1[i]--;
    		 }
    	 }
    	 sf+=s2;
    	 for(int i=0;i<26;i++) {
    		 while(al1[i]!=0) {
    			 sf+=(char)(i+97);
    			 al1[i]--;
    		 }
    	 }
    	 System.out.print(sf);
      }
      System.out.println();
	}

	

}
