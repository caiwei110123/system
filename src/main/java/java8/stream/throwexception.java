package java8.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/2/12  下午2:06
 * @Version 1.0
 */
public class throwexception {
    public static void main(String[] args)  {

        try {
            String temp = "12312";
            String tempOrgunitid = Optional.ofNullable(temp).filter(o -> StringUtils.isNotBlank(o)).orElse(null);

            System.out.println(tempOrgunitid);
            List<Date> l = new ArrayList();
            Date d = new Date();
            Thread.sleep(2000);
            l.add(new Date());
            Thread.sleep(2000);
            l.add(new Date());
            Thread.sleep(2000);
            l.add(d);
            Collections.sort(l, new Comparator<Date>() {
                @Override
                public int compare(Date o1, Date o2) {
                    return o2.compareTo(o1);
                }
            });
            System.out.println(l);
            new throwexception().a();
        } catch (Exception e) {
            System.out.println("12   "+e.getMessage());
        }
    }

    private void a(){

        System.out.println(StringUtils.isNotBlank("   ")+"    "+StringUtils.isNotBlank(null));
        System.out.println(StringUtils.isNotEmpty("   ")+"    "+StringUtils.isNotEmpty(null));
        System.out.println(StringUtils.isNoneBlank("   ")+"    "+StringUtils.isNoneBlank(null));
        System.out.println(StringUtils.isNoneEmpty("   ")+"    "+StringUtils.isNoneEmpty(null));


        String aa = "";
        String a = Optional.ofNullable(aa)
            .filter(param -> !StringUtils.isEmpty(param))
            .map((valueList) -> {
            System.out.println(123);
            return "123";
        }).orElseThrow(()-> new RuntimeException("xxxx"));
        System.out.println(a);
    }
}
