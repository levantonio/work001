package tasks;

import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        System.out.printf("num: %d\n", FuncResult(num));
        scanner.close();

    }

    public static int FuncResult(int num) {
        return (num * (num+1))/2;
    }
}

