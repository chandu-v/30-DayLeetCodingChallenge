package MayLeetCode.Week1;
import java.util.*;
public class Day3RansomNote {
    
    public static void main(String[] args) {
        
        // "fffbfg"
//         // "effjfggbffjdgbjjhhdegh"
//         "bjaajgea"
// "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"
        Day3RansomNote obj = new Day3RansomNote();
        String ransomNote = "fffbfg";
        String magazine = "effjfggbffjdgbjjhhdegh";
        System.out.println(obj.canConstruct(ransomNote,magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine){
        boolean result = false;
        result = magazine.contains(ransomNote);
        if(result){
            return result;
        }else{
            int i = 0;
            char[] ransomNoteChar = ransomNote.toCharArray();
            List<Character> list = new ArrayList<>();
            for(char c : ransomNoteChar){
                list.add(c);
            }
            for(char c : magazine.toCharArray()){
                if(list.size()>0    &&  list.contains(c)){
                    list.remove(list.lastIndexOf(c));
                    if(list.size()==0){
                        return true;
                    }
                }
            }   
            return result;
        }
    }
}