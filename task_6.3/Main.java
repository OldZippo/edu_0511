import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
// "D:\\УЦ Професионал\\ip.txt"

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

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

                    //System.out.println(checkProxy(ip, Integer.parseInt(port.trim())));
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
            //System.out.println("Проверяю " + ip +":"+ port);
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
            return "IP:"+ip+":"+port+ANSI_GREEN +" работает"+ANSI_RESET ;
        } catch (IOException e) {
           // e.printStackTrace();
            return "IP:"+ip+":"+port+ANSI_RED+" не работает"+ANSI_RESET ;
        }
    }
}
