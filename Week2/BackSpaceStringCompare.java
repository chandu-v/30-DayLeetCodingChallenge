package Week2;

import java.util.ArrayList;
import java.util.List;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String S = "ab##";
        String T = "c#d#";
        System.out.println(backspaceCompare(S, T));
    }

    public static boolean backspaceCompare(String S, String T) {
        boolean result = false;
        String resultS = getResult(S);
        String resultT = getResult(T);
        if (resultS.equalsIgnoreCase(resultT)) {
            result = true;
        }
        return result;
    }

    public static String getResult(String str) {
        List<Character> list = new ArrayList<>();        
        String result = "";

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)    ==  '#'){
                if(list.size()-1>=0){
                    list.remove(list.size()-1);
                }
                continue;
            }
            list.add(str.charAt(i));
        }
        for(int i = list.size()-1 ; i >= 0 ; i--){
            result += list.get(i);
        }
        
        return result;
    }
}