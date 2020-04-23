package recruit;

import com.alibaba.fastjson.JSONObject;
import recruit.dto.Boy;
import recruit.dto.BoyParam;
import recruit.dto.User;
import recruit.dto.CommonParam;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午1:46
 * @Version 1.0
 */
public class ActionTwo {

    public Boy getBoys(BoyParam userParam){
        Boy Boy = new Boy();
        try {
            Boy.setExtData(JSONObject.toJSONString(userParam.getPreviousNodeData()));
            if (userParam.getAge().equals(30)) {
                Boy.setBoyAge(111);
                Boy.setBoyName("boy");
                Boy.setBoyRemark("boy 30 岁");
            } else {
                Boy.setBoyAge(111);
                Boy.setBoyName("boy");
                Boy.setBoyRemark("boy 不是30 岁");
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return Boy;

    }
}
