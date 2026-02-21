// take input of three item price and print the bill , add 18% gst

import java.util.Scanner;

public class VariableAndDataType {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of pencil item ");
        float pencil = sc.nextFloat();

        System.out.println("Enter price Pen");
        float pen = sc.nextFloat();

        System.out.println("Enter price Eraser:");
        float Eraser = sc.nextFloat();

        System.out.println("Total Bill of Items: " +  (pencil + pen + Eraser));

    }
}
