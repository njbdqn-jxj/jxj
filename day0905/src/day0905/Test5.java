package day0905;

import java.io.InputStream;
import java.util.Properties;

/**
 * Properties的使用
 * 改默认Properties编码格式
 * window-perferences-content type
 * 
 * @author 蒋稀杰
 * @version [V1.00, 2020年9月5日]
 * @since V1.00
 */
public class Test5
{
    public static void main(String[] args)
    {
        Properties pos1 = new Properties();
        pos1.setProperty("asd", "hello");
        String a = pos1.getProperty("asd");
        System.out.println(a);
        System.out.println("===加载properties文件的过程===");
        // 创建Properties对象
        Properties pos = new Properties();
        // 创建一个字节流
        InputStream in = null;
        try
        {
            // 通过类名.class.getClassLoader().getResourceAsStream("properties文件名");
            in = Test5.class.getClassLoader().getResourceAsStream("config.properties");
            // Properties读取字节流
            pos.load(in);
            // 输出读取内容
            System.out.println(pos);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                in.close();
            }
            catch (Exception e)
            {
            }
        }
    }
}
