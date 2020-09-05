package day0905;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 使用DataInputStream输入数据
 * 
 * @author 蒋稀杰
 * @version [V1.00, 2020年9月5日]
 * @since V1.00
 */
public class Test2
{
    public static void main(String[] args)
    {
        InputStream is = null;
        DataInputStream dis = null;
        try
        {
            is = new FileInputStream("data");
            dis = new DataInputStream(is);
            int a = dis.readInt();
            System.out.println(a);
            boolean b = dis.readBoolean();
            System.out.println(b);
            String c = dis.readUTF();
            System.out.println(c);
            byte d = dis.readByte();
            System.out.println(d);
        }
        catch (Exception e)
        {
            System.out.println(e + "31");
        }
        finally
        {
            try
            {
                dis.close();
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
