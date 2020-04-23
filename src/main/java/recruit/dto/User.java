package recruit.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午1:46
 * @Version 1.0
 */
@Data
public class User  implements Serializable {

    private String name;

    private Integer age;

    private String remark;

}
