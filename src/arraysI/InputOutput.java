package arraysI;

import java.util.Scanner;

// how to take input, print output and update
public class InputOutput {

    public static void main(String[] args) {

        int meds [] = new int[10];
        System.out.println("Enter Arrays Elements :  ");

        Scanner sc = new Scanner(System.in);
        meds[0] = sc.nextInt();
        meds[1] = sc.nextInt();
        meds[2] = sc.nextInt();

 // Update meds[2]
        meds[2] = meds[2] + 20;


        for(int a = 0; a < 3;a++){

            System.out.println(meds[a]);
           // System.out.println(meds[i]);


        }
    }
}
