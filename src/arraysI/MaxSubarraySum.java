package arraysI;

public class MaxSubarraySum {

    public static int findMaxSubarraySum(int [] arr){

        if(arr.length <= 1){
            return arr.length;
        }
        int max_sum = Integer.MIN_VALUE;
       // int currSum = 0;

        for(int i = 0; i< arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];

            }

            if (currSum > max_sum) {
                max_sum = currSum;
            }
        }

        System.out.println(max_sum);
        return max_sum;
    }

    public static void main(String[] args) {

        int array [] = {2, -3, 4, 5, -1};
        findMaxSubarraySum(array);

    }
}
