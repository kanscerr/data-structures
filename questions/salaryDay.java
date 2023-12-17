package questions;

public class salaryDay {
    static void keepSalary(int[] parents, int[] salary, int n, int k){
        for(int sal : salary){
            int x = sal;
            while(parents[x] != -1){
                x = parents[x];
            }
            System.out.print(x+" ");
            for(int i=0;i<n;i++){
                if(parents[i] == x){
                    parents[i] = -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 11, k = 10;
        int[] parents = {-1,0,1,1,1,2,3,4,5,6,6};
        int[] salary = {1,2,3,4,5,6,7,8,9,10};
        keepSalary(parents, salary, n, k);
    }
}
