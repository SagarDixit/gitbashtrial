import java.util.Scanner; // import the Scanner class 

class Calc {
  public static void main(String[] args) {
    Scanner No = new Scanner(System.in);
    float x,y,sum,sub,mul,div;
    System.out.println("x"); 
    x = No.nextFloat();   
    System.out.println("FIrst Number X:" + x); 

    System.out.println("y"); 
    y = No.nextFloat();    
    System.out.println("Second Number y:" + y);  
   
   sum = x+y;  
   sub = x-y;
   mul = x*y;
   div = x/y;

   System.out.println("Sum x+y:" + sum);
   System.out.println("sub x-y:" + sub);
   System.out.println("mul x*y:" + mul);
   System.out.println("div x/y:" + div);

 }
}

/*    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
FFFf        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}
*/