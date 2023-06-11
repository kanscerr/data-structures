package array_algorithm;

//kadane algorithm is used to find out the consecutive subarray with maximum sum.
public class kadane {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 6, -2, 4, 9, -4, 2};

        //simple way
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            int sum = 0;
//            for(int j=i;j<arr.length;j++){
//                sum += arr[j];
//                if(sum > max){
//                    max = sum;
//                }
//            }
//        }

        //kadane's algorithm
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("final max: "+max);
    }

}

