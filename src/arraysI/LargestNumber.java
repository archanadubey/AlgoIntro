package arraysI;

public class LargestNumber {

    public static int findLargest(int numArray []){

        int largest = Integer.MIN_VALUE;

        for (int i=0; i<numArray.length;i++){

            if(numArray[i] > largest){
                largest = numArray[i];
                System.out.println(largest);
            }

        }
        return largest;



    }

    public static void main(String[] args) {
        int items [] = {100,5,10,15,20,80};

        int largestNum = findLargest(items);

        System.out.println("Largest Number is : "+largestNum);
    }

}
