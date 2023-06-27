package recursion;

public class sum_of_digits {
    static int sum(int num){
        if(num == 0){
            return 0;
        }
        int sum = num%10 + sum(num/10);
        return sum;
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(sum(num));
    }
}
