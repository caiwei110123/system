package recruit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午1:55
 * @Version 1.0
 */
public class AppTestBakup {

    public static void main(String[] args) {

        try {

            /**
             * 1.User、UserParam配置的。参水从发前端传来的。
             * UserParam配置形式：recruit.dto.CommonParam
             * User:recruit.dto.User
             */

            /**
             * 2.前端传来一个map，map中存储各个业务的参数。例如：招聘、入职、审批流、招募
             * 需要把map转成UserParam
             */







            //前台传的
            Map<String,Object> param = new HashMap<>();
            param.put("name","哈哈");
            param.put("age",310);
            param.put("boy","boy");

            //这个应该从DB读取
            String paramStr = "recruit.dto.CommonParam";
            String resultStr = "recruit.dto.User";
            String actionPath = "recruit.ActionOne";
            String acttionMethod = "getUser";


            JSONObject json = new JSONObject(param);
            Class<?> claParam = Class.forName(paramStr);
            Object userParam = JSON.toJavaObject(json,claParam);
           // Class<?> claResult = Class.forName(resultStr);

            Component component = new Component();
            Object user = component.invokeMethod(userParam,claParam,actionPath,acttionMethod);
            param.put("previousNodeData",user);
            System.out.println(JSONObject.toJSON(user));

            /**
             * =====================第一个方法执行完===================================================
             */
            //这个应该从DB读取
              paramStr = "recruit.dto.BoyParam";
              resultStr = "recruit.dto.Boy";
              actionPath = "recruit.ActionTwo";
              acttionMethod = "getBoys";

              json = new JSONObject(param);
              claParam = Class.forName(paramStr);
              userParam = JSON.toJavaObject(json,claParam);
            // Class<?> claResult = Class.forName(resultStr);

              component = new Component();
              user = component.invokeMethod(userParam,claParam,actionPath,acttionMethod);
            System.out.println(JSONObject.toJSON(user));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
