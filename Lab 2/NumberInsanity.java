import java.util.Scanner;


public class NumberInsanity {


   public NumberInsanity() { }


   public void go() {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = myScanner.nextInt();
       String msg = result(num); // call helper method and store result 
       System.out.println(msg);
        myScanner.close();
   }


   // helper method that returns string containing message to be printed
   private String result(int num) {
       // complete the code for this method;
       // make no other changes to the program

       if(num <= 0) {
            return "That isn't positive!";
       } else if(num % 2 == 1) {
            if(num % 5 == 0 && num % 7 == 0) {
                return "Divisible by both 5 and 7!";
            }
            if(num % 5 == 0) {
                return "Divisible by 5!";
            }
            if(num % 7 == 0) {
                return "Divisible by 7!";
            } else {
                return "Not divisible by 5 or 7!";
            }
       } else {
            if(num < 50) {
                return "Small even number!";
            }
            if(num >= 50 && num < 100) {
                return "Medium even number!";
            } else {
                return "Big even number!";
            }
       }
   }
}