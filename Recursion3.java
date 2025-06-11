import java.util.ArrayList;

public class Recursion3 {

    // // 1.  Print all permutation of a string
    // // Backtracking 
    // // Time complexity = O(N!)
    // public static void printPerm(String s, String perm){
    //     if(s.length()==0){
    //         System.out.println(perm);
    //         return;
    //     }
    //     for(int i =0;i<s.length();i++){
    //         char curchar= s.charAt(i);
    //         String news = s.substring(0, i) +s.substring(i+1);
    //         printPerm(news, perm+curchar);
    //     }
    // }
    // public static void main(String[] args) {
    //     String s = "abc";
    //     printPerm(s, "");
        
    // }

    // // 2. Count total paths in a maze to move from (0,0) to (n,m).

    // public static int printpath(int i,int j,int n,int m){
    //     // means the path has reached the boundary of the grid, 
    //     // and no further movement is possible.
    //     if(i==n || j==m){ 
    //         return 0;
    //     }
    //     if(i==n-1 && j==m-1){
    //         return 1;
    //     }

    //     //right
    //     int rightward = printpath(i,j+1,n,m);

    //     //down
    //     int downward = printpath(i+1,j,n,m);

    //     return downward +rightward;
    // }

    // public static void main(String[] args) {
    //     int i=0,j=0,m=3,n=4;
    //     int totalPath = printpath(i, j, n, m);
    //     System.out.println(totalPath);

        
    // }

    // // 3. Place Tiles of size 1 x m in a floor of size n X m.

    // public static int Tiles(int n,int m){
    //     if(n==m){
    //         return 2;
    //     }
    //     if(n<m){
    //         return 1;
    //     }

    //     // Vertical
    //     int vertical = Tiles(n-m, m);

    //     // Horizontal
    //     int horizontal = Tiles(n-1, m);

    //     return vertical+horizontal;


    // }

    // public static void main(String[] args) {
    //     int n =4,m=2;
    //     int tile = Tiles(n, m);
    //     System.out.println(tile);
        
    // }

    // // 4. Find the number of ways in which you can invite n people 
    // // to your party,single or in pairs.

    // public static int callGuest(int n){
    //     if(n<=1){
    //         return 1;
    //     }

    //     //single
    //     int way1 = callGuest(n-1);

    //     //pair
    //     int way2 = (n-1) * callGuest(n-2);

    //     return way1 +way2;

    // }

    // public static void main(String[] args) {
    //     int n= 4;
    //     int totalways = callGuest(n);
    //     System.out.println(totalways);
        
    // }

    // // 5.  Print all the subsets of a set of first n natural numbers.

    // public static void printSubset(ArrayList<Integer> subset){
    //     for(int i =0;i<subset.size();i++){
    //         System.out.print(subset.get(i) + " ");
    //     }
    //     System.out.println();
    // }

    // public static void subsets(int n,ArrayList<Integer> subset){
    //     if(n==0){
    //         printSubset(subset);
    //         return;
    //     }
    //     //add hoga
    //     subset.add(n);
    //     subsets(n-1, subset);

    //     //add nahi hoga
    //     subset.remove(subset.size()-1);
    //     subsets(n-1, subset);


    // }
    // public static void main(String[] args) {
    //     int n =3;
    //     ArrayList<Integer> subset = new ArrayList<>();
    //     subsets(n,subset);
        
    // }

    // // 6. Tower of Hanoi

    // public static void towerofHanoi(int n, String src, String helper, String dest){
    //     if(n==1){
    //         System.out.println("transfer of disc " + n + " from " + src +" to " + dest);
    //         return;
    //     }

    //     towerofHanoi(n-1, src, dest, helper);
    //     System.out.println("transfer of disc " + n + " from " + src +" to " + dest);
    //     towerofHanoi(n-1, helper, src, dest);

    // }

    // public static void main(String[] args) {
    //     int n = 3;
    //     String src = "S", helper ="H", dest ="D";
    //     towerofHanoi(n,src,helper,dest);
        
    // }

    // // 7. Print a string in reverse.

    // public static void reverse(String s, int idx){
    //     if(idx == 0){
    //         System.out.println(s.charAt(idx));
    //         return;
    //     }

    //     System.out.println(s.charAt(idx));
    //     reverse(s, idx-1);

    // }
    // public static void main(String[] args) {
    //     String s = "abcd";
    //     int idx = s.length() -1;
    //     reverse(s, idx);

        
    // }

}
