import java.util.*;

public class Recursions {

    // public static void TowerofHanoi(int n, String src, String helper, String dest){
    //     //Base code
    //     if (n==1){
    //         System.out.println("Transfer disc " + n + " from " + src + " to " + dest + " l6");
    //         return;  
    //     }
    //     TowerofHanoi(n-1,src,dest,helper);
    //     System.out.println("Transfer disc " + n + " from " + src + " to " + dest +" l10");
    //     TowerofHanoi(n-1,helper,src,dest);
    // }

    // //Reverse String using Recursion
    // Time complexity - O(N), N =  LENGTH OF STRING
    // public static void Reverse(String s, int idx) {
    //     if (idx == 0){
    //         System.out.print(s.charAt(idx));
    //         return;
    //     }
    //     System.out.print(s.charAt(idx));
    //     Reverse(s, idx-1);
    // }

    // Find 1st and last occurance of an element in a string.

    // public static int first = -1;
    // public static int last = -1;
    // public static void findOccurance(String s, char element, int idx){
    //     // initiate first and last with -1 to know that the element isnt in the string.
    //     if (idx == s.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }

    public static int first = -1;
    public static int last = -1;

    public static void floccurance(String s, int idx, char element){
        if(idx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(s.charAt(idx)==element){
            if (first== -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        floccurance(s, idx+1, element);


    }

    //     char curchar= s.charAt(idx);
        
    //     if (curchar == element){
    //         if(first == -1){
    //             first = idx;
    //         }else{
    //             last = idx;
    //         }
    //     }

    //     findOccurance(s, element, idx+1);

    // }

    // public static boolean SortedArray(int arr[], int idx){
    //     if ( idx == arr.length-1){ // -1 importanr her otherwise error when goes to if statement
    //         return true;
    //     }

    //     if (arr[idx] < arr[idx+1]){
    //         //array is sorted
    //         return SortedArray(arr,idx+1);
    //     }else{
    //         return false;
    //     }
    // }


    // public static void Elementend(String s,int idx){
    //     String x = "";
    //     if (idx == s.length()){
    //         System.out.print(x);
    //         return;
    //     }

    //     if(s.charAt(idx) != 'x'){
    //         System.out.print(s.charAt(idx));
    //         Elementend(s, idx+1);
    //     }else{
    //         x = x + "x";
    //         Elementend(s, idx+1);
    //     }
    // }

    // public static void Duplicate(String s,int idx){
    //     String str = "";
    //     if (s.charAt(idx) ){

    //     }

    // }

    public static void main(String args[]) {
        // int n =4 ;
        // TowerofHanoi(n,"S","H","D");

        // // String from user
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine(); // Capital L in nest line -0  remember

        // // Calling Reverse Function
        // Reverse(s, s.length() -1);


        // String str = "h ellohello";
        // char a = 'h';
        // // int first = -1;
        // // int last = -1;

        // // for(int i =0; i<str.length();i++){
        // //     if ( str.charAt(i) == a && first == -1){
        // //         first = i;
        // //     } else if (str.charAt(i) == a){
        // //         last = i;
        // //         // System.out.println("last: " + last);

        // //     }
        // // }

        // // System.out.println("first: " + first);
        // // System.out.println("last: " + last);

        // findOccurance(str, a, 0);


        //ARRAY IS SORTED?

        // int a[] = {1,2,3,3,4,5};

        // // for(int i =0; i < a.length -1 ;i++){
        // //     if (a[i] > a[i+1]){
        // //         System.out.println("unsorted");
        // //     }
        // // }
        // // System.out.println("sorted");

        // System.out.println(SortedArray(a,0));

        String str = "axbcxxd";
        // Elementend(str, 0);


        floccurance(str, 0, 'x');
    }
}

