package w0917;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest03 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:/FileTest/MyData1.txt"));
            String line;
            int num = 1;
            while ((line = br.readLine()) != null) {
                System.out.printf("%d : %s\n", num++, line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Line read Error");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Closing file Error");
                }
            }
        }
    }
}
