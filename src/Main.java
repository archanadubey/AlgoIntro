// find the sum of n natural Number
// take the input from the user
/* apply logic
    1: using loop
    2: using recursion
 print the value.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //List<String> l = new ArrayList<>();
        // input form the user
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Given Number : "+ number);

        // apply looping logic
        int fact = 0;
        for (int i=1; i<=number; i++){
            fact = fact +i;
        }
        System.out.println("Sum of given Natural number : "+ fact);


        // using recursion
       System.out.println("Recursive sum of natural number "+sum(number));

    }

    static int sum(int number){
        if (number == 1){
            return number;

        }else

            return number* sum(number - 1);



    }
}