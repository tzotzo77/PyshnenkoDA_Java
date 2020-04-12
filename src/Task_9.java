import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размер массива : ");
        int arrLength = sc.nextInt();
        if (arrLength <= 0){
            System.out.println("Массив не содержит ни одного элемента !");
            System.out.println("Заполнять не во что, выводить нечего...");
        }
        else {
            int[] myArray = new int[arrLength];
            System.out.println("Введите значения для элементов массива");
            for (int i = 0; i < myArray.length; i++) {
                System.out.print("Элемент " + i + " = ");
                int arrElement = sc.nextInt();
                myArray[i] = arrElement;
            }
            System.out.println("Элементы введенного массива, умноженные на 2 : ");
            for (int x : myArray) {
                System.out.print(x * 2 + " ");
            }
        }
    }
}
