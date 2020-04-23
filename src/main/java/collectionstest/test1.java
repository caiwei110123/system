package collectionstest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/3/21  1:21 上午
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        Map<String, Map<obj,Integer>> result = new HashMap<>();

        Map<obj,Integer> aa = new HashMap<>();
        obj o = new obj();
        o.setA("1");
        o.setB("1-1");
        o.setC("1-2");

        aa.put(o,1);
        result.put("a",aa);
        result.put("b",new HashMap<>());
        System.out.println(result.get("a"));

        System.out.println("==========");
        obj oo = new obj();
        oo.setA("1");
        oo.setB("1-1");
        oo.setC("1-2");
        aa.put(oo,2);

        obj ooo = new obj();
        ooo.setA("1");
        ooo.setB("1-1");
        ooo.setC("1-2");



        System.out.println(result.get("a").get(ooo));




    }
}
