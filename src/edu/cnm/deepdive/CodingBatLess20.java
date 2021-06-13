package edu.cnm.deepdive;

/*
Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
So for example 38 and 39 return true, but 40 returns false.

less20(18) → true
less20(19) → true
less20(20) → false
 */

public class CodingBatLess20 {

  public static void main(String[] args) {
    System.out.printf("if we use %s, the outcome is " + less20(18) + "\n", 18);
    System.out.printf("if we use %s, the outcome is " + less20(19) + "\n", 19);
    System.out.printf("if we use %s, the outcome is " + less20(20) + "\n", 20);
  }

  public static boolean less20(int n) {
    return ((n + 1) % 20 == 0 || (n + 2) % 20 == 0);
  }

}
