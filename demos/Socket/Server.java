package Socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Server {

    public  static  void  main(String[] args) throws IOException{

        ServerSocket ss = new ServerSocket(30000);
        while (true){
            // 每当接收到客户端的Socket请求的时候，服务端也对应产生一个Socket
            Socket s = ss.accept();
            // 将Socket对应的输出流包装成PrintStream
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("您好，您收到了服务器的新年祝福！");      // 输出   回写到客户端
            // 关闭输出流
            ps.close();
            // 关闭Socket
            s.close();
        }
    }
}
