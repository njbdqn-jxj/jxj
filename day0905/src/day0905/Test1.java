package day0905;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 使用DataOutputStream输出数据
 * 
 * @author 蒋稀杰
 * @version [V1.00, 2020年9月5日]
 * @since V1.00
 */
public class Test1
{
    public static void main(String[] args)
    {
        OutputStream os = null;
        DataOutputStream dos = null;
        try
        {
            os = new FileOutputStream("data");
            dos = new DataOutputStream(os);
            dos.writeInt(128);
            dos.writeBoolean(false);
            dos.writeUTF("asd");
            dos.writeByte(16);
        }
        catch (Exception e)
        {
            System.out.println(e + "31");
        }
        finally
        {
            try
            {
                dos.close();
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
