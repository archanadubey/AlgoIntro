public class LoopsPractices {

    /*
    Print
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */


    /* Half-Pyramind pattern
    * 1
    * 12
    * 123
    * 1234
    * 12345
    * */

    public static void HalfPyramind(){
        int n = 5;

        for (int line = 1; line <= n; line++){

            for(int num = 1; num <= line; num++){
                System.out.print(num);
            }
            System.out.println();

        }
    }
    public static void HalfPyramindStar(){
        int n = 4;

        for (int line = 1; line <= n; line++){

            for(int line1 = 1; line1 <= n-line+1 ; line1++){
                    System.out.print(" *");

            }
            System.out.println();

        }
    }









    public static void main(String[] args) {
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n; j++) {
//                if(i+j < n+1) {
//                    System.out.print(" *");
//                }else {
//                System.out.print(" @");
//                }
//            }
//            System.out.println();
//        }

        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(i+j > n+1) {
                    System.out.print(" @");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        HalfPyramind();
        HalfPyramindStar();

    }

}
