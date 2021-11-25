import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      //create a calculator that can calculate sin,cos,tan,log,exp,sqrt,pow,factorial
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      double num = input.nextDouble();
      num=Math.toRadians(num);

      System.out.println("Enter a function: ");
      String func = input.next();
      double result = 0;
      switch(func) {
         case "sin":
            result = Math.sin(num);
            break;
         case "cos":
            result = Math.cos(num);
            break;
         case "tan":
            result = Math.tan(num);
            break;
         case "log":
            result = Math.log(num);
            break;
         case "exp":
            result = Math.exp(num);
            break;
         case "sqrt":
            result = Math.sqrt(num);
            break;
         case "pow":
            System.out.println("Enter a power: ");
            double power = input.nextDouble();
            result = Math.pow(num, power);
            break;
         case "factorial":
            result = factorial(num);

            break;
         default:
            System.out.println("Invalid function");
            break;
      }
      System.out.println(result);
    
   }
   public static double factorial(double num) {
      if(num == 0) {
         return 1;
      }
      return num * factorial(num - 1);
      
      
   
         
      }
      
      
     }
   
      
   

   





    
 