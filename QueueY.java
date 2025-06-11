// public class QueueY {

//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear = -1;

//         // constructor
//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//         }

//         public static boolean isEmpty(){
//             return rear == -1; // if empty the rear = -1
//         }

//         // ENQUE

//         public static void add(int data){
//             if(rear == size-1){
//                 System.out.println("Queue is Full");
//                 return;
//             }
//             rear++;
//             arr[rear] = data;
//         }

//         // DEQUEUE

//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i = 0; i < rear; i++){
//                 arr[i] = arr[i+1];
//             }
//             rear--;
//             return front;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }

//             return arr[0];
//         }

//     }
    
//     public static void main(String args[]){
//         Queue q = new Queue(4);

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }


//     }
// }


public class QueueY {

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        // constructor
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1; // if empty the rear = -1
        }

        public static boolean isFull(){
            return (rear+1)%size ==  front; // if empty the rear = -1
        }



        // ENQUE

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }

            // 1st Element
            if(front == -1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // DEQUEUE

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = arr[front];

            // Single element Condition
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front +1)% size;
            }

            return front;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return arr[front];
        }

    }
    
    public static void main(String args[]){
        Queue q = new Queue(4);

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
