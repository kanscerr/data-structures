//printing n natural numbers
package recursion;
import java.util.Scanner;

public class printNaturalNumber {
    static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    static void printReverse(int n){
        if(n <= 0){
            return;
        }
        System.out.println(n);
        printReverse(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        printReverse(n);
    }
}
