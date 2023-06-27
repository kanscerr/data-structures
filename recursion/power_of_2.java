package recursion;

public class power_of_2 {
    static int power(int x){
        int pow = 2;
        if(x != 1){
            pow *= 2;
            power(--x);
        }
        return pow;
    }
    public static void main(String[] args) {
        int num = 4;
        power(num);
    }
}
