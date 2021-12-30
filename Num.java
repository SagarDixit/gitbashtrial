import java.util.Scanner; // import the Scanner class 

class Num {
  public static void main(String[] args) {
    Scanner No = new Scanner(System.in);
    float number;
    
    // Enter number and press Enter
    System.out.println("Enter number"); 
    number = No.nextFloat();   
       
    System.out.println("Number is: " + number);        
  }
}