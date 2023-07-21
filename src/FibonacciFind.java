import java.util.Scanner;

public class FibonacciFind {
    public static int   fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        else {
           return (fibonacci(n-1)+fibonacci(n-2));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(fibonacci(a));
    }
}
