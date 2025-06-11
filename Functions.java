import java.util.*;

public class Functions{

    // printing String
    // public static void PrintMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // // 3.  Average of 3 numbers
    // public static int Average(int n1,int n2, int n3){
    //     return (n1+n2+n3)/3;
    // }

    // // sum of 2 numbers
    // public static int calculateSum(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }

    // public static int mul(int a, int b){
    //     return a*b;
    // }

    // public static void factorial(int n){
    //     if (n<0){
    //         System.out.println("Invalid Number");
    //         return;
    //     }
    //     int fac =1;
    //     for(int i = 1; i<=n; i++){
    //         fac = fac * i;
    //     }
    //     System.out.println("FAC: "+ fac);
    //     return;
    // }

    // 2. Write a function to print the sum of all odd numbers from 1 to n

    // public static int SumOdd(int n){
    //     int x=0;
    //     for(int i =1; i<=n; i++){
    //         if (i%2!=0){
    //             x= x +i;
    //         }
    //     }
    //     return x;
    // }

    // 3. Write a function which takes in 2 numbers and returns the greater of those two.
    // public static int greaterNumber(int num1, int num2){
    //     if(num1>num2){
    //         return num1;
    //     }else{
    //         return num2;
    //     }
    // }
//  4. Write a function that takes in the radius as input and returns the 
    // circumference of a circle.

    // public static float circum(int n){
    //     return 2* 3.14f * n;
    // }

    // 5. Write a function that takes in age as input and returns if that person is 
    // eligible to vote or not. A person of age > 18 is eligible to vote.

    // public static String eligible(int age){

    //     if (age> 18){
    //         return "eligible to vote";
    //     }else{
    //         return "not eligible"; 
    //     }

    // }

    // 8. Two numbers are entered by the user, x and n. Write a function to find 
    // the value of one number raised to the power of another i.e. xn.


    // public static int expo(int x,int n){
    //     int m=1;
    //     for(int i= 1; i <= n;i++ ){
    //         m = m * x;
    //     }
    //     return m;
    // }

    // 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

//     // 10. Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)


    public static void fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i<=n; i++){
            System.out.println(num1 + " ");
            int sumofprevnum = num1 + num2 ;
            num1 = num2;
            num2 = sumofprevnum;

        }
    }


    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        // String name = sc.next();

        // PrintMyName(name);


        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();

        // System.out.println("Average of 2 numbers: " + Average(num1,num2,num3));


        // int sum = calculateSum(num1,num2);
        // System.out.println("Sum: " + sum);
        // System.out.println("multiplication: " + mul(num1,num2));

        // int sc = sc.nextInt();
        // factorial(m);
        // System.out.println("sum of odd number: " + SumOdd(m));

        // System.out.println("The greater number from the two is: " + greaterNumber(10, 8));

        //int x = sc.nextInt();
        // System.out.println("circumference of circle is: " + circum(5));

        // System.out.println(eligible(3));

        //6.  Write an infinite loop using do while condition.

    //     int i = 4;
    //     do{
    //         System.out.println("*");

    //     }while(i> 1);


    // }

    // System.out.println(expo(2, 6));

    fibonacci(10);

}
}