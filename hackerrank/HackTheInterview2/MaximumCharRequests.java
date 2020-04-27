package hackerrank.HackTheInterview2;

import java.util.*;

public class MaximumCharRequests {

    public static void main(String[] args) {
        String s = "aAabBcba";
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        List<List<Integer>> input = new ArrayList<>();
        input.add(list);
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        input.add(list);
        list = new ArrayList<>();
        list.add(2);
        list.add(2);
        input.add(list);
        list = new ArrayList<>();
        list.add(0);
        list.add(4);
        input.add(list);
        list = new ArrayList<>();
        list.add(0);
        list.add(7);
        input.add(list);
        List<Integer> result = getMaxCharCount(s, input);
        for(int i : result)
        {
            System.out.println(i);
        }

    }

    public static List<Integer> getMaxCharCount(String s, List<List<Integer>> queries) {
        // queries is a n x 2 array where queries[i][0] and queries[i][1] represents
        // x[i] and y[i] for the ith query.
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        s = s.toLowerCase();
        for(List<Integer> list : queries){
            map = new HashMap<>();
            int start = list.get(0);
            int end = list.get(1);
            char maxChar = 'a';
            for(int i = start ; i <= end ; i++){
                char c = s.charAt(i);
            
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }else{
                    map.put(c,1);
                    if(maxChar<c){
                        maxChar = c;
                    }
                }
            }
            result.add(map.get(maxChar));
        }
        return result;

    }

}