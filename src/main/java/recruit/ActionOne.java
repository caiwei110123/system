package recruit;

import recruit.dto.User;
import recruit.dto.CommonParam;


/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午1:46
 * @Version 1.0
 */
public class ActionOne {

    public User getUser(CommonParam userParam){
        User user = new User();
        try {
            if (userParam.getAge().equals(30)) {
                user.setName("弋猎30");
                user.setAge(30);
                user.setRemark("等于30岁");
            } else {
                user.setName("弋猎20");
                user.setAge(20);
                user.setRemark("不是30岁");
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;

    }
}
