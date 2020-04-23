package java8.stream;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/3/12  7:36 下午
 * @Version 1.0
 */
public class test12 {
    public static void main(String[] args) {
        System.out.println(new Date());

        Integer c = 0;
        for(;;) {
            c++;
            if(c>20) {
                break;
            }
        }
        System.out.println(new Date());


        Map<String,Vehicle> set = new HashMap<>();
        Vehicle v = new Vehicle();
        v.setCompanyId(1);
        v.setDeviceNos("123");
        v.setPhone("1111");
        v.setScore(0.234);
        set.put("1",v);

        v = new Vehicle();
        v.setCompanyId(1);
        v.setDeviceNos("123");
        v.setPhone("1111");
        //v.setScore(0.234);
        set.put("1",v);

        System.out.println(set);

    }
}

