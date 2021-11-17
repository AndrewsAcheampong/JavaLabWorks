package Fibonacci;

public class Fibonacci {

    int maxNumber = 10;
    int nextNumber = 1;


//    public Integer fibonacci(int n){
//
//        int fib = 0;
//
//        if (n == 0){
//
//            fib = 0;
//
//        }else if (n == 1 || n == 2) {
//
//            fib = 1;
//
//        }else {
//
//            fib = fibonacci(n - 1) + fibonacci(n - 2);
//        }
//
//        return fib;

//    }

    public int fibbi(int previousNumber){

     for (int i = 1; i <= maxNumber; ++i){

         System.out.println(previousNumber+ " ");


         int sum = previousNumber + nextNumber;
         previousNumber = nextNumber;
         nextNumber = sum;

     }

        return 0;
 }




}
