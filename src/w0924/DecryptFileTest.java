package w0924;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DecryptFileTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:/FileTest/secure1.txt"));
            String line;
            System.out.println("Decrypted Messages:");
            while ((line = br.readLine()) != null) {
                String decryptedStr = "";
                for (int i = 0; i < line.length(); i++) {
                    int code = (int) line.charAt(i);
                    code -= 100; // 암호화 때 더한 100을 뺌
                    decryptedStr += (char) code;
                }
                System.out.println(decryptedStr);
            }
        } catch (IOException e) {
            System.out.println("File Read Error");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Closing File Error");
            }
        }
    }
}
