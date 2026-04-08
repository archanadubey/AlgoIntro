package sorting;

public class BubbleSort {

    public static void    bubbleSorting(int [] arr){

        // outer loop to find the turn 0 to n-1
        for (int turn = 0; turn < arr.length-1; turn++){
            // inner loop to swap the number 0 - turn
            for(int j = 0;j<arr.length-1-turn;j++){
                // swap
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    public static void print(int [] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] array = {2,4,1,3,5};
        bubbleSorting(array);
        print(array);
    }
}
