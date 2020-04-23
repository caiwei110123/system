package recruit.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午1:48
 * @Version 1.0
 */
@Data
public class CommonParam implements Serializable {

    String name;

    Integer age;

    Map<String,Object> previousNodeData;

}
