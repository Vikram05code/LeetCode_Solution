package medium;
/*
Problem: 50 - Pow(x, n)
Link: https://leetcode.com/problems/powx-n/

Approach: Binary Exponentiation (Divide and Conquer)

Idea:
- Break problem into halves:
  x^n = (x^(n/2))^2
- If n is odd → multiply by x once more
- Handle negative power using reciprocal

Time Complexity: O(log n)
Space Complexity: O(log n)
*/


public class Pow50 {

    public double pow(double x, long n){
        if(n==0){
            return 1.0;
        }
        double temp = pow(x, n/2);
        if(n%2==0){
            return temp*temp;
        }else{
            return temp*temp*x;
        }
    }


    public double myPow(double x, int n) {
        long N = n;
        if(N < 0){
            return pow(1/x, -N);
        }
        return pow(x, N);
    }

    public static void main(String[] args){
        Pow50 pow50 = new Pow50();
        double result = pow50.myPow(2.0, 10);
        System.out.println("Result: " + result);
    }
}
