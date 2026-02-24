
// Practice Factorial Problem

public class Factorial {

    // factorials of a numbers

    public static int NumberFactorial(int n ){

        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact = fact * i;

        }
        return fact;
    }




    // find factorial 0f n in recursive method

    public static int  recursiveFactorial(int n){

        // break point of loop

        if(n == 0 ) return 1;

        return n * recursiveFactorial(n - 1);

    }



    public static void main(String[] args) {

        int n = 5;

        int numberFact = NumberFactorial(n);
        System.out.println("Number Factorials: "+ numberFact );

        int factresult =  recursiveFactorial(n);

        System.out.println("Fact result: " + factresult);

        int factresult1 =  recursiveFactorial(20);
        System.out.println("Fact result of 20 : " + factresult1);



    }

}
