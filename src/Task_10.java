import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размер матрицы :");
        System.out.print("Число срок = ");
        int arrStrings = sc.nextInt();
        if (arrStrings <= 0) {
            System.out.println("");
            System.out.println("Матрица не содержит ни одного элемента !");
            System.out.println("Заполнять не во что, выводить нечего...");
        } else {
            System.out.print("Число столюцов = ");
            int arrСolumns = sc.nextInt();
            if (arrСolumns <= 0) {
                System.out.println("");
                System.out.println("Матрица не содержит ни одного элемента !");
                System.out.println("Заполнять не во что, выводить нечего...");
            } else {
            int[][] myArray = new int[arrStrings][arrСolumns];
            System.out.println("");
            System.out.println("Введите значения для элементов матрицы");
            for (int i = 0; i < arrStrings; i++) {
                for (int j = 0; j < arrСolumns; j++) {
                    System.out.print("Элемент [" + i + "]" + "[" + j + "] = ");
                    int arrElement = sc.nextInt();
                    myArray[i][j] = arrElement;
                }
            }
            System.out.println("");
            System.out.println("Элементы первой строки матрицы, умноженные на 3 : ");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < arrСolumns; j++) {
                    System.out.print(myArray[i][j] * 3 + " ");
                    }
                System.out.println("");
                }
            }
        }
    }

}
