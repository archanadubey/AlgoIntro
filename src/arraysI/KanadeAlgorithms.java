package arraysI;

import static arraysI.MaxSubarraySum.findMaxSubarraySum;

public class KanadeAlgorithms {
        public static void  findMaxSubarraySum(int [] arr){
            int max_sum = Integer.MIN_VALUE;

            for(int i = 0; i<arr.length;i++) {
                int curSum = 0;
                curSum += arr[i];


                if (curSum > max_sum) {
                    max_sum = Math.max(curSum,max_sum);
                }
            }
            System.out.println(max_sum);
        }
    public static void main(String[] args) {
        int array [] = {4,-2,4,5,-1};

        findMaxSubarraySum(array);
    }
}
