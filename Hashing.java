import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        // Creation
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(1); // List.add(el)
        set.add(2); 
        set.add(3);
        set.add(4); 
        set.add(5);

        // Size
        System.out.println("Size of set is " + set.size());

        // Print all elements
        System.out.println(set);
        
        // Search
        if(set.contains(1)) System.out.println("Set contains 1");
        if(!set.contains(6)) System.out.println("doesnot contain 6");
        
        // Deletion
        set.remove(1);
        if(!set.contains(1)) System.out.println("deleted 1");
        set.add(1);

        // Iterator
        Iterator it = set.iterator();
        // hasNext, Next

        while(it.hasNext()) System.out.println(it.next());

        // HashMap

        // Creation
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 120);
        map.put("China", 120);

        // Size
        System.out.println("Size of set is " + map.size());

        // Print all elements
        System.out.println(map);

        map.put("China", 200);
        System.out.println(map);
        
        // Search
        if(map.containsKey("Indo")) System.out.println("key present");
        else System.out.println("Key not present");

        // Get
        System.out.println(map.get("India"));
        System.out.println(map.get("Indo"));

        // Array
        int[] arr = {12,2,3,4,44};

        for(int i = 0;i< arr.length;i++) System.err.print(i + " ");
        for(int val: arr) System.err.print(val + " ");

        System.out.println();

        for(Map.Entry<String,Integer> e : map.entrySet()) System.err.println(e.getKey() + " " + e.getValue());

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for(String key: keys) System.out.println(key + " " + map.get(key));

        
        // Deletion
        map.remove("China");
        System.out.println(map);
        // if(!set.contains(1)) System.out.println("deleted 1");
        // set.add(1);

        // // Iterator
        // Iterator it = map.iterator();
        // // hasNext, Next

        // while(it.hasNext()) System.out.println(it.next());
        


    }
}