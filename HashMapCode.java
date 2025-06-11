import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{ // hashmap data structure // generics
        // private class Node{
        //     K key;
        //     V value;

        //     public Node(K key, V value){
        //         this.key = key;
        //         this.value = value;
        //     }
        // }

        private class Node{
            K key;
            V value;
            private Node (K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        // Constructor for HashMap
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i < 4;i++) buckets[i] = new LinkedList<>();
        }

        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int di =0; di <ll.size();di++){
                if(ll.get(di).key == key) return di;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i =0; i < N*2 ;i++) buckets[i] = new LinkedList<>();

            for(int i =0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j= 0; j < ll.size(); j++ ){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } 
            else {
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            // rehashing
            double lambda = (double)N/n;
            if(lambda > 2){
                rehash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) {
                return null;
            } 
            else {
                Node data = buckets[bi].get(di);
                return data.value; 
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) {
                return null;
            } 
            else {
                Node data = buckets[bi].remove(di);
                return data.value; 
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) return false;
            else return true;
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int bi =0; bi< buckets.length;bi++){
                LinkedList<Node> ll = buckets[bi];
                for(int di =0; di< ll.size();di++){
                    Node node = ll.get(di);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public static void main(String[] args) {
            HashMap<String,Integer> map = new HashMap<>();

            map.put("India",100);
            map.put("USA",100);
            map.put("China",100);
            map.put("Indonasia",100);

            ArrayList<String> keys = map.keySet();
            for(int i =0; i<keys.size();i++) System.out.println(keys.get(i) + " " + map.get(keys.get(i)));

            System.out.println();

            map.remove("India");
            for(int i =0; i<keys.size();i++) System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
            System.out.println(map.get("India"));
        }

    }
}
