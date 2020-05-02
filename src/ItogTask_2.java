import java.util.Scanner;

public class ItogTask_2 {
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
            int temp, j;
            for(int i = 0; i < myArray.length - 1; i++){
                if (myArray[i] > myArray[i + 1]) {
                    temp = myArray[i + 1];
                    myArray[i + 1] = myArray[i];
                    j = i;
                    while (j > 0 && temp < myArray[j - 1]) {
                        myArray[j] = myArray[j - 1];
                        j--;
                    }
                    myArray[j] = temp;
                }
            }
            System.out.println("Отсортированный по возрастанию массив : ");
            for (int x : myArray) {
                System.out.print(x + " ");
            }
        }
    }
}
