package Week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {

    public static void main(String[] args) {
        int [] arr = new int[]{2,2};
        System.out.println(lastStoneWeight(arr));
    }
    public static int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(int i : stones){
            list.add(i);
        }
        while(list.size()>1){
            Collections.sort(list);
            for(int i : list){
                System.out.print(i+",");
            }
            System.out.println();
            int largest = list.get(list.size()-1);
            list.remove(list.size()-1);
            int secondLargest = list.get(list.size()-1);
            list.remove(list.size()-1);
            if(largest == secondLargest){
                continue;
            }else{
                list.add(largest-secondLargest);
            }
        }
        return list.size()>0?list.get(0):0;
    }
}