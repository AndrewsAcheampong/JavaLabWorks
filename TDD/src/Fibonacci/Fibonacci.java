package Fibonacci;

public class Fibonacci {


    public Integer fibonacci(int n){

        int fib = 0;

        if (n == 0){

            fib = 0;

        }else if (n == 1 || n == 2) {

            fib = 1;

        }else {

            fib = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return fib;
    }


}
