package memoization;
public class fibonacci {
    static int fib(int n){
        int[] memo = new int[n];
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(memo[n-1] != 0){
            return memo[n-1];
        }
        memo[n-1] = fib(n-1) + fib(n-2);
        return memo[n-1];
    }
    public static void main(String[] args){
        System.out.println(fib(21));
    }
}