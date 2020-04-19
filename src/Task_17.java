import java.io.*;

public class Task_17 {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 'stop' для прекращения записи в файл");
        try (FileWriter fw = new FileWriter("D:\\GIT_repository\\Java_PyshnenkoDA\\Task_File.txt"))
        {
            do {
                //System.out.println(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str +"\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода : " + ex);
        }
    }
}
