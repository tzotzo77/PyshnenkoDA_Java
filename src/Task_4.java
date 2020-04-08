import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате : ");
        String binNum = sc.nextLine();
        int decimalNum = 0;
        int arrInt = 0;
        for (int i = 0; i < binNum.toCharArray().length; i++) {
            arrInt = Integer.parseInt(Character.toString(binNum.toCharArray()[i]));
            decimalNum = decimalNum + arrInt*((int)(Math.pow(2, binNum.toCharArray().length-1-i)));
        }
        System.out.println("Число " + binNum + " в десятичном формате = " + decimalNum);
    }
}
