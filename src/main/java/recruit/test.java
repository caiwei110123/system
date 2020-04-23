package recruit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import recruit.dto.BoyParam;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/8  下午5:06
 * @Version 1.0
 */
public class test {

    public static void main(String[] args) {
        String a = "{\"previousNodeData\":\"{\\\"age\\\":20,\\\"name\\\":\\\"弋猎20\\\","
            + "\\\"remark\\\":\\\"不是30岁\\\"}\",\"name\":\"哈哈\",\"boy\":\"boy\",\"age\":310}";

        JSONObject j = JSON.parseObject(a);
        System.out.println(j);


        BoyParam b = JSON.toJavaObject(j, BoyParam.class);
        System.out.println(b);
    }
}
