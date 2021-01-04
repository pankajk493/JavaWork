package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	
	static {
		System.out.println("in block 1");
	}
	static {
		System.out.println("in block 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //System.out.println(Math.PI);
      A objA=new A();
      B objB=objA.new B();
      C objC=new A.C();
      System.out.println("in main block");
      
  
	}

}
