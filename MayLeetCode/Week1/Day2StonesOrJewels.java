package MayLeetCode.Week1;

import java.util.*;

public class Day2StonesOrJewels {

    public static void main(String[] args) {
        Day2StonesOrJewels obj = new Day2StonesOrJewels();
        String J = "z";
        String S = "ZZ";
        System.out.println(obj.numJewelsInStones(J, S));
    }
    public int numJewelsInStones(String J, String S) {
        // Finding number of Jewels in Stones.
        int result = 0 ;
        char [] Jewels = J.toCharArray();
        char [] Stones = S.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : Jewels){
            list.add(c);
        }
        for(char c : Stones){
            if(list.contains(c)){
                result++;
            }
        }

        return result;
    }
}