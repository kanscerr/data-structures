package recursion;

public class sum_of_natural_number {
    static int s = 0;
    void sum(int n){
        if(n > 0){
            s+=n;
            sum(--n);
        }

    }
    public static void main(String[] args) {
        sum_of_natural_number r = new sum_of_natural_number();
        int n = 5;
        r.sum(n);
        System.out.println(s);
    }
}
