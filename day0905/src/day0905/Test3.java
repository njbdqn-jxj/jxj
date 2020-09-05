package day0905;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

/**
 * 使用ObjectOutputStream输入数据
 * 
 * @author 蒋稀杰
 * @version [V1.00, 2020年9月5日]
 * @since V1.00
 */
public class Test3
{
    public static void main(String[] args)
    {
        OutputStream os = null;
        ObjectOutputStream oos = null;
        Order ord = new Sub(13, "mike", 1.3, new Date(), "nan");
        try
        {
            os = new FileOutputStream("Order");
            oos = new ObjectOutputStream(os);
            oos.writeObject(ord);
            System.out.println("ok");
        }
        catch (Exception e)
        {
            System.out.println(e + "31");
        }
        finally
        {
            try
            {
                oos.close();
            }
            catch (Exception e)
            {
            }
            try
            {
                os.close();
            }
            catch (Exception e)
            {
            }
        }
    }
}
