package Socket;

import java.net.InetAddress;

/**   IP地址
 * Created by Administrator on 2017/1/18.
 */
public class InetAddressTest {
    public static void  main(String[] args) throws  Exception{
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println(ip);    //www.baidu.com/163.177.151.110
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getCanonicalHostName());

        InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});
        System.out.println(local);
        System.out.println(local.isReachable(2000));
        System.out.println(local.getCanonicalHostName());



    }
}
