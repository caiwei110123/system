package fanxing;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/3  下午6:21
 * @Version 1.0
 */
public class testClass<T extends fanxingA> {

    T context;

    public testClass(T context) {
        this.context = context;
        if (context instanceof fanxingC) {
            fanxingC jsonObject = JSON.parseObject("",fanxingC.class);
            System.out.println("fanxingC");
        } else  if (context instanceof fanxingD){
            System.out.println("fanxingD");
        }
    }

    public static void main(String[] args) {
        new testClass(new fanxingD());
    }
}
