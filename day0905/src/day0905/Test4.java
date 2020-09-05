package day0905;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * 使用ObjectInputStream输入数据
 * 
 * @author 蒋稀杰
 * @version [V1.00, 2020年9月5日]
 * @since V1.00
 */
public class Test4
{
    public static void main(String[] args)
    {
        InputStream is = null;
        ObjectInputStream ois = null;
        try
        {
            is = new FileInputStream("Order");
            ois = new ObjectInputStream(is);
            Order ord = new Order();
            ord = (Order)ois.readObject();
            System.out.println("ok");
            System.out.println(ord);
            ord = (Order)ois.readObject();
            System.out.println("ok");
            System.out.println(ord);
        }
        catch (Exception e)
        {
            System.out.println(e + "31");
        }
        finally
        {
            try
            {
                ois.close();
            }
            catch (Exception e)
            {
            }
            try
            {
                is.close();
            }
            catch (Exception e)
            {
            }
        }
    }
}
