package tasks;

import java.util.Scanner;

// n! (произведение чисел от 1 до n)
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        System.out.printf("num: %d\n", Factorial(num));
        scanner.close();
    }

    public static int Factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++){
            res = res * i;
        }
        return res;
    }
}
