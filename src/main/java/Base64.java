import sun.misc.BASE64Decoder;

/**
 *  Base64使用心得
 */
public class Base64 {

    public static void main(String[] args){
        System.out.println(getBASE64("hello"));
        System.out.println(getFromBASE64("aGVsbG8="));
    }


    // 将 s 进行 BASE64 编码
    public static String getBASE64(String s) {
        if (s == null) return null;
        return (new sun.misc.BASE64Encoder()).encode( s.getBytes() );
    }

    // 将 BASE64 编码的字符串 s 进行解码
    public static String getFromBASE64(String s) {
        if (s == null) return null;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // 解码结果保存到byte数组中
            byte[] b = decoder.decodeBuffer(s);
            // 根据byte创建string哦
            return new String(b);
        } catch (Exception e) {
            return null;
        }
    }

}
