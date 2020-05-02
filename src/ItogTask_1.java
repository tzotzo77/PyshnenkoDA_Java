import java.util.Scanner;

public class ItogTask_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите число в бинарном формате : ");
        String binNum = sc.nextLine();
        int decimalNum = 0;
        int arrInt = 0;
        boolean binTrue = true;
        for (int i = 0; i < binNum.toCharArray().length; i++) {
            arrInt = Integer.parseInt(Character.toString(binNum.toCharArray()[i]));
            if (arrInt != 0 & arrInt != 1)
            {
                binTrue = false;
                System.out.println("Вы ввели число НЕ в бинарном формате!");
            } else {
                decimalNum = decimalNum + arrInt * ((int) (Math.pow(2, binNum.toCharArray().length - 1 - i)));
            }
        }
        if (binTrue) {
            System.out.println("Число " + binNum + " в десятичном формате = " + decimalNum);
        }
    }
}
