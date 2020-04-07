package fibonacci;

public class Fibonacci {
    public static long fibo(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
}
