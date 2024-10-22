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
    /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
    */
    public boolean rightTriangle(int side1, int side2, int side3) {
        /* implement this method */
        int largest = largest(side1, side2, side3);
        if(side1 == largest) {
            if(Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)) {
                return true;
            }
        } else if(side2 == largest) {
            if(Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)) {
                return true;
            }
        } else if (side3 == largest) {
            if(Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) {
                return true;
            }
        }
        return false;
    }
  }  