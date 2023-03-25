package tasks;
//Вывести все простые числа от 1 до 1000
//        Простые числа - числа которые деляться только
//        на 1 и на само себя без остатка(кроме 1).
public class Task3 {
    public static void main(String[] args) {

        boolean flag = true;

        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);flag=true;
        }
    }
}
