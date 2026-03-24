package arraysI;

import java.util.HashMap;

public class BasicJavaCoding {

    // palindrome of String
    public static boolean  palindrome(String str){
        System.out.println("Original string :" + str);
        String reverse = "";
        for(int i = str.length()-1; i >= 0;i--){
            reverse += str.charAt(i);
        }
        System.out.println("Revesed string :" + reverse);
        if(str.equals(reverse)){
            return true;
        }else
            return false;
    }
    //Frequency Count of a String

    public static void frequencyCount(String fCount){

        char [] ch = fCount.toCharArray();
        System.out.println(ch);

        HashMap<Character ,Integer> map1= new HashMap<Character ,Integer>();

        for(char s: ch){

                map1.put(s,map1.getOrDefault(s,0)+1);


        }
        System.out.println(map1);
    }

    // first non repeating char
    public static char nonReapeating(String str){

     //   char [] ch = fCount.toCharArray();
      //  System.out.println(ch);

        HashMap<Character, Integer> map= new HashMap<Character ,Integer>();

        // Step 1: count frequency
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: find first non-repeating
        for(char c : str.toCharArray()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return '_';

    }

    public static void main(String[] args) {

        String str = "Level";

        palindrome(str);

        String fCount = "aabbczxddad";

        frequencyCount(fCount);

        String firstUnique = "apple";
        char result = nonReapeating(firstUnique);
        System.out.println("First Non Repeating Char: "+result);

    }
}
