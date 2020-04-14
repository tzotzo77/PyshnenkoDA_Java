import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        String S = sc.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println("S = " + S);
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
    }
}
