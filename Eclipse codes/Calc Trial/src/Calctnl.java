import java.util.Scanner; // import the Scanner class 

class Calctnl {
  public static void main(String[] args) {
	  
	  Scanner No = new Scanner(System.in);
	  Scanner Operation = new Scanner(System.in);

	  float x,y,ans;
	  String operator;

	  System.out.println("Enter First Number: x"); 
	  x = No.nextFloat();   
	  
	  System.out.println("Enter Second Number: y"); 
	  y = No.nextFloat();     

	  System.out.println("Enter Operator: +, -, *, /"); 
	  operator = Operation.nextLine();
	  
	     
         if (operator.equals("+")) 
       			{ ans = x+y; System.out.println("x + y = " + ans); }

         else if (operator.equals("-")) 
       			{ ans = x-y; System.out.println("x - y = " + ans); }

         else if (operator.equals("*")) 
       			{ ans = x*y; System.out.println("x * y = " + ans); }

         else if (operator.equals("/") && y!=0) 
       			{ ans = x/y; System.out.println("x / y = " + ans); }

         else   { System.out.println("Something Wrong ");}
       
 }  
}