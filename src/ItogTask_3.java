import java.util.Scanner;

public class ItogTask_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Курс доллара = ");
        double course  = sc.nextDouble();
        System.out.print("Количество рублей : ");
        double rub  = sc.nextDouble();
        double x =  Math.round((rub/course)*100);
        double usd  = x/100;
        String stringUSD = Double.toString(usd);
        int pointPosition = stringUSD.indexOf('.');
        if (pointPosition + 1 == stringUSD.toCharArray().length - 1)
        {
            System.out.println("Итого : " + stringUSD +"0");
        }else{
            System.out.println("Итого : " + stringUSD);
        }
    }
}
