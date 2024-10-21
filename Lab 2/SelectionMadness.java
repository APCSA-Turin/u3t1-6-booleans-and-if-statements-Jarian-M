public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
       /* implement this method */

       int fortuneChooser = (int) (Math.random() * 5 + 1);
       String for1 = "Today will go your way!";
       String for2 = "Today is not you day!";
       String for3 = "You think it's a secret, but they know. They know.";
       String for4 = "Someone will make you smile today.";
       String for5 = "Someone new will come into your life soon.";

        if (fortuneChooser == 1) {
            return for1;
        } else if (fortuneChooser == 2) {
            return for2;
        } else if (fortuneChooser == 3) {
            return for3;
        } else if (fortuneChooser == 4) {
            return for4;
        } else {
            return for5;
        }
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
       /* implement this method */
        if(num1 > num2) {
            if(num1 > num3) {
                return num1;
            }
        } else if(num2 > num3) {
            return num2;
        }
        return num3;
    }
  }  