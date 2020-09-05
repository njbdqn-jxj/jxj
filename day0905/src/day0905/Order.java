package day0905;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 存储数据
 * 
 * @author 蒋稀杰
 * @version [V1.00, 2020年9月5日]
 * @since V1.00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4286022584066047981L;

    private Integer id;
    
    private String name;
    
    private Double money;
    
    private Date date;
}
