public class LoopsQuestions{
    public static void main(String args[]){
        int n=5;
        int m = 5;
        
        System.out.println();
        System.out.println("1. SolidRectangle");
        System.out.println();



        for(int i =1; i<=n; i++){
            for(int j =1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("2. HollowRectangle");
        System.out.println();


        //Outer Loop

        for(int i =1; i<=n;i++){
            //Inner Loop
            for(int j =1; j<=m; j++){
                if (i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("3. HalfPyramid");
        System.out.println();

        for (int i =1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }

        System.out.println();
        System.out.println("4. InvertedHalfPyramid");
        System.out.println();
        for (int i=n; i>=1; i--){
            for ( int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // inverted half pyramid (Rotated 180 degree)
        System.out.println("5. Inverted half pyramid (Rotated 180 degree)");
        System.out.println();

        for (int i=1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("6. Pyramid with Numbers");
        System.out.println();


        for(int i =1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("7. Inverted Pyramid with Numbers");
        System.out.println();
        
        
        for(int i = n;i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("8. Floyd Triangle");
        System.out.println();

        int a=1;
        for(int i =1; i<=n; i++){
            for( int j=1;j<=i; j++){
                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("9. 0-1 Triangle");
        System.out.println();


        for(int i=1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                } 
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("10. BUTTERFLY PATTTERN");
        System.out.println();

        //Upper Half
        for (int i =1; i <=n ; i++){
            for(int j =1; j<=i ; j++){
                System.out.print('*');
            }

            for(int j =1; j <= 2*(n-i); j++){
                System.out.print(' ');
            }

            for(int j = 1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println(' ');
        }
        // Lower Half

        for (int i = n; i>= 1; i--){
            for (int j = 1; j<=i ;j++){
                System.out.print("*");
            }
        
            for(int j=1; j <= 2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("11. Solid Rhombus");
        System.out.println();


        for(int i = 1; i< n; i++){
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j =1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("12. Number Pyramid");
        System.out.println();

        for(int i = 1; i<=n;i++){
            for (int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j= 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("13. Palindrome Pattern");
        System.out.println();

        for(int i =1;i<=n;i++){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("14. Diamond Pattern");
        System.out.println();



        //Upper Half
        for (int i = 1; i<=n;i++){
            for (int j=1; j<= n-i;j++){
                System.out.print(" ");
            }
            for (int j =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n; i>=1;i--){
            for (int j=1; j<= n-i;j++){
                System.out.print(" ");
            }
            for (int j =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
