package Socket;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**   实现 MIME字符 和 字符串 之间的转换
 * Created by Administrator on 2017/1/18.
 */
public class URLDecoderTest {
    public static void main(String[] args) throws  Exception{

        String keyWord = URLDecoder.decode("%E7%96%AFjava","utf-8");
        System.out.println(keyWord);

        String urlStr = URLEncoder.encode("疯狂java讲义","GBK");
        System.out.println(urlStr);
    }
}
