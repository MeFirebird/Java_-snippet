package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Client {

    public static void main(String[] args) throws IOException{

        Socket socket = new Socket("127.0.0.1",30000);
        // 将Socket对应的输入流包装成BufferedReader        包装输入流   用来读
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();    // 读取流
        System.out.println("来自服务器的数据:" + line);
        br.close();
        socket.close();
    }
}
