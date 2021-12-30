import java.util.Scanner; // import the Scanner class 

class Calct {
  public static void main(String[] args) {
    Scanner No = new Scanner(System.in);
    Scanner Operation = new Scanner(System.in);

    float x,y,sum,sub,mul,div;
    String operator;

    System.out.println("Enter First Number: x"); 
    x = No.nextFloat();   
    
    System.out.println("Enter Second Number: y"); 
    y = No.nextFloat();     

    System.out.println("Enter Operator: sum, sub, mul, div"); 
    operator = Operation.nextLine();
   
if (operator.equals("sum")) 
       { sum = x+y;
         System.out.println("Sum x+y:" + sum); }

else if (operator.equals("sub")) 
       { sub = x-y;
         System.out.println("Sub x-y:" + sub); }


else if (operator.equals("mul")) 
       { mul = x*y;
         System.out.println("Mul x*y:" + mul); }


else if (operator.equals("div")) 
       { div = x/y;
         System.out.println("Div x/y:" + div); }

 else { System.out.println("Something Wrong");}
  }
}
