import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Задайте размер массива : ");
        int arrLength = sc.nextInt();
        if (arrLength <= 0){
            System.out.println("Массив не содержит ни одного элемента !");
        }
        else {
            int[] myArray = new int[arrLength];
            System.out.println("Введите значения для элементов массива");
            for (int i = 0; i < myArray.length; i++) {
                System.out.print("Элемент " + i + " = ");
                int arrElement = sc.nextInt();
                myArray[i] = arrElement;
            }
            for (int i = myArray.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (myArray[j] > myArray[j + 1]) {
                        int tmp = myArray[j];
                        myArray[j] = myArray[j + 1];
                        myArray[j + 1] = tmp;
                    }
                }
            }
            System.out.println("Отсортированный по возрастанию массив : ");
            for (int x : myArray) {
                System.out.print(x + " ");
            }
        }
    }
}

