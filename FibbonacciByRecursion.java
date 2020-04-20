import java.util.Scanner;

public class FibbonacciByRecursion {
    public int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        else{
            return fib(n-2)+fib(n-1);
        }
    }

    public static void main(String[] args) {
        FibbonacciByRecursion f = new FibbonacciByRecursion();
        Scanner sc=new Scanner(System.in);
        System.out.println(f.fib(sc.nextInt()));
    }
}
