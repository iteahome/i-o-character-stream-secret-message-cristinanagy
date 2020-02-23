import java.io.FileReader;
import java.io.IOException;

public class NewClass {

    public static void main(String[] args) throws IOException {

        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("C:\\Users\\Cristina\\OneDrive\\Desktop\\secret.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                if (temp >= 65 && temp <= 90) {
                    if (temp == 88) {
                        System.out.print(' ');
                    } else {
                        System.out.print((char) temp);
                    }

                }
        } finally {
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}