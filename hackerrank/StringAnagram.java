package hackerrank;

import java.util.*;

public class StringAnagram {

    public static void main(String[] args) {
        String [] dict = new String[]{"listen",
            "tow",
            "silent",
            "lisent",
            "two",
            "abc",
            "no",
            "on"};
        String [] q = new String[]{"two",
            "bca",
            "no",
            "listen",
        "abcd"};
        List<String> dictionary = convert(dict);
        List<String> query = convert(q);
        List<Integer> result = stringAnagram(dictionary, query);
        for(int i : result){
            System.out.println(i);
        }

    }
    public static List<String> convert(String[] arr){
        List<String> list = new ArrayList<>();
        for(String str: arr){
            list.add(str);
        }
        return list;
    }

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        LinkedHashMap<String,Integer> dictHashMap = organizeList(dictionary);
        List<String> queryHashMap = organizeQuery(query);
        for(String str : queryHashMap){
            if(dictHashMap.containsKey(str)){
                result.add(dictHashMap.get(str));
            }else{
                result.add(0);
            }
        }
        
        return result;
    
        }
    
    public static List<String> organizeQuery(List<String> query){
        List<String> result = new ArrayList<>();
        for(int i = 0 ; i < query.size() ; i++){
            char [] charArr = query.get(i).toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            result.add(str);
        }
        return result;
    }

    public static LinkedHashMap<String,Integer> organizeList(List<String> dictionary){
        LinkedHashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
        for(int i = 0 ; i < dictionary.size() ; i++){
            char [] charArr = dictionary.get(i).toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            if(result.containsKey(str)){
                result.put(str, result.get(str)+1);
            }else{
                result.put(str, 1);
            }
        }
        return result;
    }
    // public static List<List<String>> groupAnagrams(String[] strs) {
    //     Map<String,List> map = new HashMap<>();
    //     for(String str : strs){
    //         char[] temp = str.toCharArray();
    //         // System.out.print(new String(temp)+",");
    //         Arrays.sort(temp);
    //         // System.out.println(new String(temp));
    //         if(map.containsKey(new String(temp))){
    //             map.get(new String(temp)).add(str);
    //         }else{
    //             List<String> list = new ArrayList<>();
    //             list.add(str);
    //             map.put(new String(temp),list );
    //         }
    //     }
    //     List<List<String>> list = new ArrayList<>();
    //     for(List<String> lStrings : map.values()){
    //         list.add(lStrings);
    //     }
    //     return list;

    // }
}