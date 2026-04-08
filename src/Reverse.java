import java.util.Scanner;

public class Reverse {
    // Reverse a number

    public static int ReverseNumber(int number){

        //int digit = number;
        int rev = 0;
    while(number>0) {
        int reminder = number % 10;
        rev = ( rev * 10 ) + reminder;
        number = number / 10;

    }

    return rev;

    }

    public static String reverseString(String name){
        String rev = "";
        for(int i = name.length()-1; i >=0; i--){

            rev = rev + name.charAt(i);

        }
        return rev;
    }




    public static void main(String[] args) {
        System.out.println("Enter Number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Entered Number: "+ num);
        int result = ReverseNumber(num);
        System.out.println("Reversed Number: "+result);


       // Reverse a String "Archana"
        String name = "Archana";
        String rev = reverseString(name);
        System.out.println("Original String: "+ name);
        System.out.println("Reversed String : " +rev);



    }
}
