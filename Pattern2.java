public class Pattern2{
    public static void main(String args[]){
        int n=5;
        for(int i = 1;i<=n;i++){
            int a=i;
            for(int j =1;j<=i;j++){
                if(j==1){
                    System.out.print(a + " ");
                } 
                else if (j%2==0){
                    a = a + (2*(n-i)+ 1);
                    System.out.print(a +" "); 
                }
                else{
                    // System.out.print(a + " ");
                    a = a + 2*(n-i);
                    System.out.print(a + " ");
                }
            }
            System.out.println();
        }
    }
    
}

