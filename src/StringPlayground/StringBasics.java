package StringPlayground;

import org.jetbrains.annotations.NotNull;

public class StringBasics {
    /*
    * Given a string, return a string made of the first 2 chars (if present),
    * however include first char only if it is 'o' and include the second only if it is 'z',
    * so "ozymandias" yields "oz".
    *
Expected OUTPUT:
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
    * */
    public static @NotNull String startOz(String str){

        if(str.length() >= 2 && str.substring(0).equals('o') && str.substring(1,2).equals('z')){
            return "oz";

        }
        return str;
    }
    public static void main(String[] args) {
        String result = startOz("ozymandias");
        System.out.println(result);
    }
}
