package tree.demo3;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午3:35
 * @Version 1.0
 */
@Data
public class Mutation implements  Cloneable{
    private String type;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
