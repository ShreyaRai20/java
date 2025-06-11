public class MergeSort {
    public static void(int arr[],int si,int mid,int ei){
        int merge[] =new int[ei-si+1];
        int idx1 =si;
        int idx2 = mid+1;
        int x = 0;
        while(idx<=mid && idx2<=ei){
            if(arr)
        }
    }

    public static void divide(int arr[],int si,int ei){
        if(si<=ei){
            return;
        }

        mid =  si+(ei-si)/2; 
        //si+ei/2 - gives time complexity and if we have large index 
        // it will give us an index that might be out of range.

        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);

    }
    public static void main(String[] args) {
        int arr[] ={6,3,9,5,2,8};
        int n = arr.length;
        
    }
    
}
