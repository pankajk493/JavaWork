package oops;

public class MethodIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int firstNumber=34;
          int secondNumber=22;
          int result=maxOf(firstNumber,secondNumber);
          maxOf(400,600);
          System.out.println(result);
          sayHi();
          
	}
          static int maxOf(int a,int b) {
        	  if(a>b)
        		  {
        		  return a;
        		  }
        	  else {
        		  return b;
        		  }}
          static void sayHi() {
        	  System.out.println("Hi");
        	  System.out.println("Good Morning");
          }
          }
          
