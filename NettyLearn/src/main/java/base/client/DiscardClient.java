package base.client;

import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端
 *
 * @author caizy
 * @date 2019/11/4 10:45
 **/
public class DiscardClient {

    public static void main(String[] args) throws Exception {
        Socket client = new Socket("127.0.0.1", 8088);
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.write("hello!");
        pw.flush();
        pw.close();
    }
}
