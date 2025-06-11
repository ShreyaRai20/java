public class Fibonacii {

    public static void fibonacii(int n){
        int num1 = 0;
        int num2 = 1;
        for (int i =0;i<=n;i++){
            System.out.println("fibonacii: " + num1);
            int sum = num1+num2;
            num1 = num2;
            num2 = sum;
        }

    }

    public static int fibsum(int n){
        // if(n==0){
        //     return 0;
        // }else if(n==1 || n==2){
        //     return 1;
        // }else{
        //     return n+fibsum(n-1);

        int num1 = 0;
        int num2 = 1;
        int sum =0;
        for (int i =0;i<=n;i++){
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
        }
        return sum;
    }



    public static void main(String args[]){
        fibonacii(10);
        System.out.println("FIBSUM "+ fibsum(10));
    }
    
}
