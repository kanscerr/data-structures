package recursion;
import java.util.Scanner;
public class number_of_zero {
    static int count = 0;
    static void countZero(int num){
        if(num == 0){
            return;
        }
        if(num%10 == 0){
            count++;
        }
        countZero(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        countZero(num);
        System.out.println(count);
    }
}

