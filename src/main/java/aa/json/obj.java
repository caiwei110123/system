package aa.json;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/5/14  下午4:12
 * @Version 1.0
 */
@Data
public class obj {
    String a;
    List<Map<String,Object>> obj;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public List<Map<String, Object>> getObj() {
        return obj;
    }

    public void setObj(List<Map<String, Object>> obj) {
        this.obj = obj;
    }
}
