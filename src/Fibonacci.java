import java.util.Scanner;

/*
 * Author: Hojjat Shabab
 *
 * Created on April 14, 2021, 1:20 PM
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("welcome to the Fibonacci program!");
        System.out.println("Please enter number...");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        System.out.println("Fibonacci without method recursive");
        fib(num);

        System.out.println("Fibonacci with method recursive");
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            sum += fibRec(i);
            System.out.print(fibRec(i) + "\t");
            if (i == num)
                System.out.println("\nFibonacci[" + num + "]  is " + sum);
        }


    }

    private static void fib(int num) {
        int num1 = 1, num2 = 1, result = 0, sum;
        System.out.print(num1 + "\t" + num2 + "\t");
        for (int i = 2; i < num; i++) {
            sum = num1 + num2;
            System.out.print(sum + "\t");
            if (i % 2 == 0) {
                num1 += num2;
                result = num1;
            }
            if (i % 2 == 1) {
                num2 += num1;
                result = num2;
            }
        }
        System.out.println("\nFibonacci[" + num + "]  is " + result + "\n");
    }

    //***************************************you can use recursive method*************************************//
    private static int fibRec(int num) {
        if (num == 0 || num == 1)
            return num;
        else
            return fibRec(num - 2) + fibRec(num - 1);
    }
}
