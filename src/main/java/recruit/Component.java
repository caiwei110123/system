package recruit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import recruit.dto.ActionHandler;
import recruit.dto.CommonParam;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午1:45
 * @Version 1.0
 */
public class Component  {
    public void invokeAction(Map<String,Object> param, Map<String,List<ActionHandler>> handlerMap){
        try {
            //前端传来 startApplication
            String code = "startApplication";
            List<ActionHandler> currentActionHandlers = handlerMap.get(code);
            currentActionHandlers.stream().forEach(actionHandler -> {
                JSONObject json = new JSONObject(param);
                Class<?> claParam = null;
                try {
                    claParam = Class.forName(actionHandler.getParamPath());
                    System.out.println("拿到的参数：   "+json);
                    Object userParam = JSON.toJavaObject(json,claParam);
                    Component component = new Component();
                    Object user = component.invokeMethod(userParam,claParam,actionHandler.getHandlerPath(),actionHandler.getMethodName());
                    Map<String,Object> userMap = null;
                    if (Objects.nonNull(user)) {
                        userMap = (Map<String, Object>)JSONObject.toJSON(user);
                    }
                    if (Objects.nonNull(param) && Objects.nonNull(param.get("previousNodeData"))) {
                        Map<String,Object> temp = (Map<String, Object>)param.get("previousNodeData");
                        Map<String,Object> allMap = new HashMap<>();
                        if (Objects.nonNull(temp) && temp.size() > 0) {
                            allMap.putAll(temp);
                        }
                        if (Objects.nonNull(userMap) && userMap.size() > 0) {
                            allMap.putAll(userMap);
                        }
                        param.put("previousNodeData",allMap);
                    } else {
                        JSONObject jsonTemp = (JSONObject)JSONObject.toJSON(user);
                        param.put("previousNodeData",jsonTemp);
                    }
                    System.out.println("拿到的结果是：   "+user);
                    // System.out.println("================================");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            });
        }catch (Exception e) {
            e.printStackTrace();;
        }
    }
    public  Object invokeMethod(Object param,Class<?> paramClass,String actionPath,String actionMethod){
        Object result = null;
        try {
            Class<?> cla = Class.forName(actionPath);
            Object action =  cla.newInstance();
            Method method = cla.getMethod(actionMethod, paramClass);
            result = method.invoke(action,param);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
