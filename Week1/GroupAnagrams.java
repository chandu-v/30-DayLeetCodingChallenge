package Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] arr = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(arr);
        for(List<String> parent : list){
            for(String str : parent){
                System.out.print(str+",");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();
        for(String str : strs){
            char[] temp = str.toCharArray();
            // System.out.print(new String(temp)+",");
            Arrays.sort(temp);
            // System.out.println(new String(temp));
            if(map.containsKey(new String(temp))){
                map.get(new String(temp)).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(new String(temp),list );
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(List<String> lStrings : map.values()){
            list.add(lStrings);
        }
        return list;

    }
}