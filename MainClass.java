package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayDeque<Integer> ad=new ArrayDeque<>();
     ad.push(12);
     ad.push(32);
     ad.push(55);
     
     System.out.println(ad.pop());
     System.out.println(ad.pop());

       
	}
}
