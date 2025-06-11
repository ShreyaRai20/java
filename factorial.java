public class factorial {
    public static void fac(int n){
        int x=1;
        if (n==0){
            System.out.println("Invalid number");
            return;

        }else{
            for(int i = 1;i<=n;i++){
                x= x*i;
            }
            System.out.println(x);
        }
    }

    public static void main(String args[]){
        fac(5);
    }
}
