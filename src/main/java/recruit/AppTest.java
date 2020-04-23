package recruit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import recruit.dto.ActionHandler;
import recruit.util.BeanToMapUtil;

import java.util.*;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午1:55
 * @Version 1.0
 */
public class AppTest {

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

            Map<String,List<ActionHandler>> handlerMap = new HashMap<>();

            //准备数据，从DB查，缓存起来
            List<ActionHandler> actionHandlerList = new ArrayList<>();
            //第一个handlerMethod
            ActionHandler handler = new ActionHandler();
            handler.setHandlerName("ActionOne");
            handler.setHandlerPath("recruit.ActionOne");
            handler.setMethodName("getUser");
            handler.setOrders(1);
            handler.setParamPath("recruit.dto.CommonParam");
            handler.setResultPath("recruit.dto.User");
            actionHandlerList.add(handler);

            //第二个handlerMethod
            handler = new ActionHandler();
            handler.setHandlerName("ActionTwo");
            handler.setHandlerPath("recruit.ActionTwo");
            handler.setMethodName("getBoys");
            handler.setOrders(2);
            handler.setParamPath("recruit.dto.BoyParam");
            handler.setResultPath("recruit.dto.Boy");
            actionHandlerList.add(handler);
            handlerMap.put("startApplication",actionHandlerList);


            Component component = new Component();
            component.invokeAction(param,handlerMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
