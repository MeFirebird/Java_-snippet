//import java.util.DateAndTime.Date;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by Administrator on 2016/11/2.
 */
public class Test {

    public static void main(String[] args) throws IOException{
        System.out.println("梦想还是要有的，万一实现了呢？");
        System.out.println("只要你够坚持，一定可以到达你想要的境界和远方!" + " 加油！骚年！");

        Properties prop  = new Properties();
        // 调用load方法  将配置文件读到流中
        prop.load(new InputStreamReader(Test.class.getResourceAsStream("config.properties")));
        // 从流中读取对应的value
        String stadiumType= prop.getProperty("stadiumType");
        System.out.println(stadiumType);
    }
}

