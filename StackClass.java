import java.util.*;


// public class StackClass {
//     // LinkedList
//     static class Node{
//         int data;
//         Node next;
        
//         // Constructor
//         public Node(int data){
//             this.data = data;
//             next = null;
//         }
//     }
    
//     static class Stack{
//         public static Node head;

//         public static boolean isEmpty(){
//             return head == null;
//         }

//         public static void push(int data){
//             Node newNode = new Node(data);
//             if(isEmpty()){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }

//     }


//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     } 
// }


// public class StackClass {
//     // ArrayList
//     static class Stack{
//         static ArrayList<Integer> list = new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size() == 0;
//         }

//         public static void push(int data){
//             list.add(data);
//         }

//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }


//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(7);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//         // Stack using Collection Framework
//         Stack<Integer> s1 = new Stack<>();
//         s1.push(1);
//         s1.push(2);
//         s1.push(3);
//         s1.push(4);
//         s1.push(7);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     } 
// }

// public class StackClass {
//     public static void main(String args[]){
        
//         // Stack using Collection Framework
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(7);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     } 
// }


// Push to Bottom 

// public class StackClass {
//     public static void pushToBottom(int data,Stack<Integer> s){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
        
//         int top = s.pop();
//         pushToBottom(data,s);
//         s.push(top);
//     }

//     public static void reverse(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop(); // top = 3
//         reverse(s); // 1,2
//         pushToBottom(top, s); // 3, [1,2] 

//     }
//     public static void main(String args[]){
        
//         // Stack using Collection Framework
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         reverse(s);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     } 
// }


public class StackClass {
    public static void pushToBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushToBottom(data, s);
        s.push(top);

    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        pushToBottom(top, s);
    }
    public static void main(String args[]){
        
        // Stack using Collection Framework
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        // pushToBottom(5, s);
        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    } 
}

