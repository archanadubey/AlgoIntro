package arraysI;

public class PairArray {

    public static void printPair(int array []){

        int count = 0;
        for (int i = 0; i< array.length -1; i++){
            for(int j = i+3; j<array.length; j++){

             //   for()

                System.out.print("("+array[i]+","+array[j]+") ");
                count++;

            }
            System.out.println();
        }
        System.out.println("count: "+ count);
    }

    public static void main(String[] args) {

        int arrNum [] = {2,4,6,8,10};

        printPair(arrNum);



    }
}
