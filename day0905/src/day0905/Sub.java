package day0905;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * order的子类
 * 
 * @author 蒋稀杰
 * @version [V1.00, 2020年9月5日]
 * @since V1.00
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Sub extends Order
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4286022584066047981L;
    
    private String ship;
    
    public Sub()
    {
    }
    
    public Sub(int id, String name, double money, Date data, String ship)
    {
        super(id, name, money, data);
        this.setShip(ship);
    }
}
