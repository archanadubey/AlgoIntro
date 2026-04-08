package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.sort;

public class GroupAnnagram {
    public static List<List<String>> makeGroupAnnagram(String [] strs){

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char [] ch = str.toCharArray();
            sort(ch);
            String sorted = new String(ch);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
            }

            map.get(sorted).add(str);
        }

       return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
         String [] groupstrs  = {"eat","tea","tan","ate","nat","bat"};
        System.out.println( makeGroupAnnagram(groupstrs));
//        List<List<String>> result = makeGroupAnnagram(groupstrs);
//        System.out.println(result);
    }
}
