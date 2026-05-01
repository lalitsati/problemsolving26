package com.problem.solving26.May2026;

/**
 * Problem Description-
 * Given an integer A, you need to find the count of it's factors.
 * Factor of a number is the number which divides it perfectly leaving no remainder.
 * Example : 1, 2, 3, 6 are factors of 6
 *
 *
 * Example ----
 *  Input : 5
 *  Output: 2
 *  Explanation :
 *      Factors of 5 are 1 and 5.
 *
 *  Input : 10
 *  Output1: 4
 *  Explanation 1:
 *     Factors of 10 are 1, 2, 5 and 10.
 */
public class Q1CountFactors2 {

    public static void main(String[] args) {
        int num = 34555;
        System.out.println(findFact(num));
        System.out.println(findFact2(num));
    }

    private static int findFact2(int num) {
        int iteration=0;
        int count=2;
        for(int i=2;i*i<num;i++) {
            iteration++;
            if(num%i==0) {
                count +=2;
            }
        }
        System.out.println("Iteration - "+iteration);
        return count;
    }

    public static int findFact(int num) {
        int iteration=0;
        int i=2;
        int count=2;
        while(i<=num/2) {
            iteration++;
            if(num%i==0){
                count++;
            }
            i++;
        }
        System.out.println("Iteration - "+iteration);
        return count;
    }
}
