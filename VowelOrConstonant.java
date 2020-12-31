package college;
import java.util.*;
public class VowelOrConstonant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         char chart=scan.next().charAt(0);
         switch(chart) {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
        	 System.out.println("Vowel");
        	 break;
        	 default:
        		 System.out.println("constonant");
        		 break;
         }    
	}
}
