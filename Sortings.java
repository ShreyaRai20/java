public class Sortings {

    public static void printArray(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {7,8,3,1,2};

        // Bubble Sorting
        // Time complexity - big O(n^2)
        for(int i = 0; i < arr.length -1 ;i++){ //n-1
            for (int j=0 ; j< arr.length - i -1 ; j++){
                if(arr[j]> arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;
                }

            }
        }
        printArray(arr);


        int ar[] = {7,8,3,1,2};

        // Selection Sorting
        for(int i = 0; i < ar.length -1 ;i++){ //n-1
            int smallest = i;
            for (int j = i + 1 ; j< ar.length; j++){
                if(ar[j]< ar[smallest]){
                    // Swap
                    smallest =j;
                }
            }
            //swap
            int temp = ar[smallest];
            ar[smallest] = ar[i];
            ar[i] = temp;
        }
        printArray(ar);



        int a[] = {7,8,3,1,2};

        // Insertion sort

    }

}
