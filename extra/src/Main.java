import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
            URL url = new URL("https://rut-miit.ru");
            InputStream input = url.openStream();
            StringBuilder stringBuilder = new StringBuilder();
            int c;
            while((c=input.read())!=-1){
                stringBuilder.append((char) c);
            }
            String str = stringBuilder.toString();

            int k = 0;

            char[] charArray = str.toCharArray();

            for (int i = 0; i < charArray.length - 2; i++) {
                if ((charArray[i] == '<') && (charArray[i+1] == 'p') && (charArray[i+2] == '>')) {
                    k++;
                }
            }

            System.out.println(k);
    }
}