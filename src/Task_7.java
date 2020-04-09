import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        int num = sc.nextInt();
        final int X = 0;
        final int Y = 11;
        final int Z = -7;
        switch(num)
        {
            case X :
            case Y :
            case Z :
                System.out.println("Данное значение имеется в константах");
                break;
            default :
                System.out.println("Такой константы нет!");
        }
    }
}
