package Week4;

import java.util.*;

public class LRUCache {

    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    int capacity;
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* capacity */ );

        System.out.println(cache.get(2));
        cache.put(2,6);
        System.out.println(cache.get(1));
        cache.put(1,5);
        cache.put(1,2);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        // cache.put(1, 1);
        // cache.put(2, 2);
        // cache.get(1); // returns 1
        // cache.put(3, 3); // evicts key 2
        // cache.get(2); // returns -1 (not found)
        // cache.put(4, 4); // evicts key 1
        // cache.get(1); // returns -1 (not found)
        // cache.get(3); // returns 3
        // cache.get(4); // returns 4
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            stack.remove(stack.indexOf(key));
            stack.push(key);
            return map.get(key);
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.size()>=capacity){
            if(map.containsKey(key)){
                stack.remove(stack.indexOf(key));
                stack.push(key);
                map.put(key, value);
            }else{
                int remove = stack.get(0);
                stack.remove(0);
                map.remove(remove);
                map.put(key, value);
                stack.push(key);
            }
            
        }else{
            stack.push(key);
            map.put(key, value);
        }
    }
}