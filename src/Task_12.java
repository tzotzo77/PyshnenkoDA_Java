import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку : ");
        String str = sc.nextLine();
        System.out.println("Веденная строка без пробелов");
        System.out.println(str.replaceAll(" ",
                ""));
    }
}
