import java.util.HashSet;

public class RecursionsQ {

    // // push elements to the end.
    // public static String newString = "";
    // public static void pushelment(String s, char element,int idx){
    //     if(idx == s.length()){
    //         System.out.print(newString);
    //         return;
    //     }
        
    //     if (s.charAt(idx)==element){
    //         newString = newString + element;
    //         // System.out.println(element+ " ele");
    //         // pushelment(s, element, idx+1);
    //     }else{
    //         System.out.print(s.charAt(idx));
    //         // pushelment(s, element, idx+1);
    //     }
    //     pushelment(s, element, idx+1);

    // }

//     public static void isSorted(int a[],int idx){

//         if(a[idx]);
//     }
//     public static void main(String args[]){
//         String str = "axbcdxnxncxn";
//         char element = 'x';
//         pushelment(str, element, 0);

//     }
    
// }

// // Subsequence question:
// // Time complexity -O(2^N)

public static void subsequence(String s,int idx, String newString){

    if(idx == s.length()){
        System.out.println(newString);
        return;
    }

    char curchar = s.charAt(idx);

    //to be
    subsequence(s, idx+1, newString+curchar);

    // not to be
    subsequence(s, idx+1, newString);


}

// public static void main(String args[]){
//     String s = "abc";
//     subsequence(s, 0,"");


// }



// Unique subsequence 


public static void Uniquesubsequence(String s,int idx, String newString, HashSet<String> set){

    if(idx == s.length()){
        if (set.contains(newString)){
            return;
        }else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
    }

    char curchar = s.charAt(idx);

    //to be
    Uniquesubsequence(s, idx+1, newString+curchar, set);

    // not to be
    Uniquesubsequence(s, idx+1, newString, set);


}

public static void main(String args[]){
    String s = "aaa";
    HashSet<String> set = new HashSet<>();
    Uniquesubsequence(s, 0,"", set);
    subsequence(s, 0, "");

}



}