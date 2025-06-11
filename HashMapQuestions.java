import java.util.*;

public class HashMapQuestions {
    public static void majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i< n; i++){
            if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i], 1) ;
        }

        for(Integer key: map.keySet()) {
            if(map.get(key) > n/3) System.out.println(key);
        }
    }

    public static HashSet<Integer> union(int[] set1,int[] set2){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<set1.length;i++) set.add(set1[i]);
        for(int i =0; i<set2.length;i++) set.add(set2[i]);
        System.out.println(set.size());
        return set;

    }

    public static int intersection(int[] set1,int[] set2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> setI = new HashSet<>();

        int count=0;
        for(int i =0; i<set1.length;i++) set.add(set1[i]);
        for(int i =0; i<set2.length;i++){
                if(set.contains(set2[i])) {
                    count++;
                    set.remove(set2[i]);
                    setI.add(set2[i]);
                }
            }
        System.out.println(setI);
        return count;
    }

    public static String Intinerary(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tick.keySet()){
            revMap.put(tick.get(key),key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)) return key;
        }
        return null;
    }

    public static void Sum(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans =0;
        int sum =0;

        for(int j = 0; j< arr.length;j++){
            sum += arr[j];

            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }



    public static void main(String[] args) {
        int nums[] = {1,2,7};
        majorityElement(nums);
        System.out.println();
        int nums1[] = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums1);

        System.out.println(union(nums, nums1));
        System.out.println();
        System.out.println(intersection(nums, nums1));

        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = Intinerary(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start + "->");
            start = tickets.get(start);
        }
        System.out.println(start);

        int[] arr =  {10,2,-2,-20,10};
        int k = -10;

        Sum(arr,k);
    }
    
}
