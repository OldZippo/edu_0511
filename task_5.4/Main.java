//D://УЦ Професионал/text.txt
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader inStream = new FileReader(reader.readLine());
        BufferedReader reader1 = new BufferedReader(inStream);
        ArrayList<Integer> arr  = new ArrayList<Integer>();

        String sStr = " ";
        while ((sStr = reader1.readLine()) != null) {
            int i = Integer.parseInt(sStr);
            if(( i % 2 ) == 0) arr.add(i);
        }
        reader1.close();

        Collections.sort(arr);
        for(int i = 0; i < arr.size(); i++) System.out.println(arr.get(i));
    }
}
