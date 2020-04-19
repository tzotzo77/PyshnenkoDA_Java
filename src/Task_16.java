import java.io.*;

public class Task_16 {
    public static void main(String[] args) {
        String str;
        try (BufferedReader br = new BufferedReader(new FileReader
                ("D:\\GIT_repository\\Java_PyshnenkoDA\\Task_File.txt")))
        {
            while ((str = br.readLine()) != null)
            {
            System.out.println(str);
            }
        }
        catch (IOException ex){
            System.out.println("Ошибка ввода-вывода : " + ex);
        }
    }
}
