import java.util.Arrays;

public class MergeTwoSortedArray {


   public static int [] mergeTwoArray(int a[],int b[]){
       // since the array is sorted we can create a new array and assign the value to it.
       // create empty Array
       int[] c = new int[a.length + b.length];
       int j = 0;
       int i = 0;
       int m = 0;
       int al = a.length-1;
       int bl = b.length-1;
       while (i <= al && j <= bl) {

           if(a[i] <= b[j]){
               c[m] = a[i];
               i++;

           }else {
               c[m] = b[j];
               j++;
           }
           m++;
       }

       // coping remaining element from array a

       while(i <= al){
           c[m++] = a[i++];

       }

       // coping remaining element from array b

       while(j <= bl){
           c[m++] = b[j++];

       }

        return c;
   }

   //Solving without using extra space

    public static int [] mergeTwoArrayWithoutSpace(int []a, int m ,int n, int[]b){

       int i = m - 1;
       int j = n - 1;
       int k = m + n -1;

       while(j >= 0 ){

           if(i >= 0  && a[i] > b[j]){
               a[k] = a[i];
               i--;
           }else {
               a[k] = b[j];
               j--;
           }

           k--;
       }
        return a;

    }


    public static void main(String[] args) {

        // merge two given sorted array

        int [] a1 = {1,2,3,0,0,0};
        int [] b1 = {2,5,6};
        int m = 3;
        int n = 3;

      int [] result = mergeTwoArray( a1, b1);
      System.out.println("With Space : "+Arrays.toString(result));

        int []  result1 =  mergeTwoArrayWithoutSpace(a1,m,n,b1);
        System.out.println(Arrays.toString(result1));

    }

}
