package recruit.dto;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午4:21
 * @Version 1.0
 */
@Data
public class ActionHandler {
    String handlerName;
    String handlerPath;
    String methodName;
    String paramPath;
    String resultPath;
    Integer orders;
}
