// Joy Schwarting
// CS 145
// Towers of Hanoi
//
// Program utilizing Recursion. This solves this 'towers of hanoi' math problem in which we
// want to move 64 discs from one pole to another pole with the smallest size on top,
// without ever putting a bigger disc on top of a smaller disc. these 64 discs are 
// increasing in size from top to bottom. Obviously, the computer would need a long time to do 
// this math problem since it takes 18,446,744,073,709,551,615 moves to move 64 poles with
// this method. So, I'm including a scanner with this one so you can type how many
// discs you would like to test and it will show you the moves and number of moves it takes.
// After 25 my computer started going a little crazy so if your computer has the 
// power to do that go for it. I'm including a seperate java file with 'n' already set to 4.


import java.math.BigInteger;
import java.util.Scanner;

public class TowerWithScanner {

      static int count = 1; // count number is number of disc moves

      public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("How many discs are on the starting pole?");
            int n = console.nextInt();
            
            move(n, "A", "B", "C"); // n is # of discs, A, B, and C are names of poles
      }
      
      // move method with 'n' as number of discs, start pole, support (auxilary) pole, end pole
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
      
} // end TowerWithScanner class