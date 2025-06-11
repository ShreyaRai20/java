import java.util.*;

class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;
        
        // Constructor  
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add - first, last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode ;
    }

    // Print
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete - first, last
    public void deleteFirst(){
        // Corner Case => empty linked list
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        // Corner Case => empty linked list
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head == null || head.next == null) {
            return;
        }
        //  prevNode -> currNode -> nextNode
        //  4 -> 5 -> 6
        // 
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;


    }

    public void deleteNode(int n){

    }

    public static void main(String args[]) {
        System.out.println("Created null list");
        LL list = new LL();

        list.printList();
        System.out.println("added first node");
        list.addFirst("is");
        list.printList();
        // System.out.println("added first node");
        // list.addFirst("a");
        // list.printList();
        // System.out.println("added last node");
        // list.addLast("b");
        // list.printList();
        // System.out.println("Size of the list: " + list.getSize());
        // list.reverseIterate();
        // list.printList();
        // System.out.println("deleted first node");
        // list.deleteFirst();
        // list.printList();
        // System.out.println("deleted last node");
        // list.deleteLast();
        // list.printList();
        // System.out.println("Size of the list: " + list.getSize());
        
        // System.out.println();
        // System.out.println("List2");
        // System.out.println();

        // LL list1 = new LL();
        // list1.addLast("1");
        // list1.addLast("2");
        // list1.addLast("3");
        // list1.addLast("4");
        // list1.addLast("5");
        // list1.addLast("6");
        // list1.printList();
        // list1.reverseIterate();
        // list1.printList();
        // list1.head = list1.reverseRecursive(list1.head);
        // list1.printList();

        // LL list2 = new LL();
        // list2.addLast("6");
        // list2.printList();
        // list2.reverseIterate();
        // list2.printList();
        // list2.head = list2.reverseRecursive(list2.head);
        // list2.printList();

    }

    // public static void main(String[] args) {
    //     LinkedList<String> list = new LinkedList<String>();
    //     list.addFirst("a");
    //     list.addFirst("is");
    //     System.out.println(list);
    //     list.addFirst("this");
    //     list.add("list");
    //     // list.addLast("list");
    //     System.out.println(list);
    //     System.out.println(list.size());
        
    //     for(int i = 0; i <list.size();i++) {
    //         System.out.print(list.get(i) + " -> ");
    //     }
    //     System.out.println("null");

    //     for(int i = 0; i <list.size();i++) {
    //         if(list.get(i) == "list"){
    //             System.out.println(i);
    //         }
    //     }
    //     list.remove(3);
    //     System.out.println(list);
    //     list.removeFirst();
    //     System.out.println(list);
    //     list.removeLast();
    //     System.out.println(list);
        
    //     // Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). 
    //     // Search for the number 7 & display its index.
    //     LinkedList<Integer> elements = new LinkedList<Integer>();
    //     elements.add(1);
    //     elements.add(5);
    //     elements.add(7);
    //     elements.add(3);
    //     elements.add(8);
    //     elements.add(2);
    //     elements.add(3);

    //     for(int i = 0; i <elements.size();i++) {
    //         if(elements.get(i) == 7){
    //             System.out.println(i);
    //         }
    //     }
    
    // // Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
    // // Delete all nodes which have values greater than 25.
    // LinkedList<Integer> newElements = new LinkedList<Integer>();

    

    // }
}