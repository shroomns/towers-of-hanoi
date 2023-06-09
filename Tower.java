// Joy Schwarting
// CS 145
// Towers of Hanoi
//
// Program utilizing Recursion. This solves this 'towers of hanoi' math problem in which we
// want to move more than 1 discs from one pole to another pole with the smallest size on top,
// without ever putting a bigger disc on top of a smaller disc. these discs are 
// increasing in size from top to bottom. Here is my recursive program for 4 discs. I also
// am attaching another java file for a recursive program where you can input
// any number of discs and it will work (recommended lower than 21 so you can actually
// get an answer in a timely fashion, unless you have a supercomputer)

import java.util.*;

public class Tower {

      static int count = 1; // count number is number of disc moves

      public static void main(String[] args) {
            move(4, "A", "B", "C");  // 4 is # of discs, A, B, and C are names of poles
      } // end main
      
      // move method with 'n' as number of discs, start pole, support (auxiliary) pole, and end pole
      public static void move(int n, String start, String auxiliary, String end) {     
            if (n==1) {
                  System.out.println(count + " Move " + start + " to " + end);
                  count++;
            } else {
               move(n-1, start, end, auxiliary); // method call within method
               System.out.println(count + " Move " + start + " to " + end);
               count++;
               move(n-1, auxiliary, start, end);
            }
      } // end move method
      
} // end tower class