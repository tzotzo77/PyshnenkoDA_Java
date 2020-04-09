import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double avg = (x+y+z)/3;
        System.out.println("Среднее арифмитическое введенных чисел = "+ avg);
        int a = (int)avg/2;
        if ( a > 3 ) {
            System.out.println("Программа выполнена корректно" );
        }
    }
}
