package recursion;
import java.util.Scanner;
public class reverse_number {
    static int reversed = 0;
    static void reverse(int num){
        if(num == 0){
            return;
        }
        reversed = reversed * 10 + num%10;
        reverse(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);
        System.out.println(reversed);
    }
}
