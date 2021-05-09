import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

//  Запись работающих прокси-серверов в файл good.txt.  Реализованно в методе checkProxy.
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream( "D:\\УЦ Професионал\\ip.txt");
            int i;
            String proxy = "";
            while ((i=fin.read()) != -1) {
                if (i==10) {
                    String ip = proxy.split(":") [0];
                    String port = proxy.split(":") [1];
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(checkProxy(ip, Integer.parseInt(port.trim())));
                        }
                    });
                    thread.start();
                    proxy = "";
                }else if(i != 9) {
                    proxy += (char) i;
                } else {
                    proxy += ":";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String checkProxy(String ip, int port){
        try {
            FileWriter writer = new FileWriter( "D:\\УЦ Професионал\\good.txt", true);
            String text;
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URLConnection urlConnection = new URL("https://vozhzhaev.ru/test.php").openConnection(proxy);
            InputStream is = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            char[] buffer = new char[256];
            int rc;
            StringBuilder sb = new StringBuilder();
            while ((rc = reader.read()) != -1) {
                sb.append((char)rc);
            }
            text = "IP:" + ip + ":" + port + " работает\n";
            writer.write(text);
            writer.close();
            return
                "IP:" + ip + ":" + port + ANSI_GREEN + " работает" + ANSI_RESET;
        } catch (IOException e) {
            return "IP:"+ip+":"+port+ANSI_RED+" не работает"+ANSI_RESET ;
        }
    }
}
