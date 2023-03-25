package tasks;

import java.util.Scanner;

//Реализовать простой калькулятор Использовать сканнер:
// Scanner scanner = new Scanner(System.in);
// String enter = scanner.next();
// int i = Integer.parseInt(enter);
public class Task4 {
    public static int resultCalc(String operation, int num1, int num2) {
        int res = 0;

        for (int i = 0; i<100 ; i++) {


            if (operation == "+") {
                res = num1 + num2;

            } else if (operation == "-") {
                res = num1 - num2;

            } else if (operation == "*") {
                res = num1 * num2;

            } else if (operation == "/") {
                res = num1 / num2;
            }


        }
        return res;
    }









    public static int numberCreate() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static String operator() {
        Scanner scanner = new Scanner(System.in);
        String operat = scanner.nextLine();
        return operat;
    }


    public static void main(String[] args) {
        System.out.println("Enter number1 : ");
        int num1 = numberCreate();
        System.out.println("Enter operation + - *  /: ");
        String operation = operator();
        System.out.println("Enter number2 : ");
        int num2 = numberCreate();
        int result = resultCalc(operation, num1, num2);
        System.out.println(resultCalc(operation, num1, num2));
        System.out.printf("%d %s %d = %d", num1, operation, num2, result);

    }
}

