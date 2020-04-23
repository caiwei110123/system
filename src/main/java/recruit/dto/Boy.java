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
public class Boy implements Serializable {

    private String boyName;

    private Integer boyAge;

    private String boyRemark;

    private String boy;

    String extData;
}
