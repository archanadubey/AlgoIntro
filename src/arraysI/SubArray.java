package arraysI;

public class SubArray {

    public static void printArrayElements(int arr []){

        int sum =0;
        for (int i = 0; i < arr.length; i++){
           // int start = i;
            for (int j = i; j < arr.length;j++){
              //  int end = j;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                     //sum += arr[k];

                    System.out.print(arr[k]);
                   // System.out.print(sum);


                    if(k<j)
                     System.out.print(",");
                }

                System.out.println("]");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int arr [] = {2,3,4,5,1};

        printArrayElements(arr);
    }

}
