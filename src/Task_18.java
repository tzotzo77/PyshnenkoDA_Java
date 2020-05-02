import java.io.*;

public class Task_18 {
    public static void main(String[] args) {
        String str;
        int i = 1;
        int j = 0;

        try (BufferedReader br = new BufferedReader(new FileReader
                ("D:\\GIT_repository\\Java_PyshnenkoDA\\Task_File.txt")))
        {
            while ((str = br.readLine()) != null)
            {
                i++;
                System.out.println(str);
            }
        }
        catch (IOException ex){
            System.out.println("Ошибка ввода-вывода : " + ex);
        }
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введите 'stop' для прекращения записи в файл");
        try (FileWriter fw = new FileWriter("D:\\GIT_repository\\Java_PyshnenkoDA\\Task_File.txt"))
        {
            do {
                j++;
                if (i==j) break;
                str = br2.readLine();
                str = str +"\r\n";
                fw.write(str);
            } while (true);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода : " + ex);
        }
    }
}
