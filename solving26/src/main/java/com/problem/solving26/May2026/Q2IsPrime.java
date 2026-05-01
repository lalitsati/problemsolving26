package com.problem.solving26.May2026;

/**  (n*(n+1))/2  - Formula for sum natural number
 *
 * Problem Description -
 * Given a number A. Return 1 if A is prime and return 0 if not.
 * Note :
 * The value of A can cross the range of Integer.
 *
 * Example
 *     Input :
 *              A = 5
 *     Output : 1
 *     Explanation - 5 is a prime number.
 *
 *     Input :
 *              A = 10
 *    Output : 2
 *    Explanation - 10 is not a prime number.
 */
public class Q2IsPrime {

    public static void main(String[] args) {
        int num=23;
        System.out.println(isPrime(num));
    }

    private static int isPrime(int num) {
        int iteration=0;
        for(int i=2;i*i<num;i++) {
            iteration++;
            if(num%i==0)  {
                System.out.println("Iteration -"+iteration);
                return 2;
            }
        }
        System.out.println("Iteration -"+iteration);
        return 1;
    }
}
