package fanxing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/3  下午6:21
 * @Version 1.0
 */
public class fanxingA {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.parse("2019-12-01 00:00:01").getTime());


        System.out.println(sdf.parse("2020-12-01 00:00:01").getTime());

        String aaa = "1.3448";
        Double aaaa = Double.parseDouble(aaa);

        System.out.println(Double.parseDouble(aaa));
        System.out.println(Long.parseLong("1.3448"));
        List<List<Object>> aa = new ArrayList<>();
        List<Object> a = new ArrayList<>();
        a.add("访问瓦罐");
        a.add(4654);
        aa.add(a);

        a = new ArrayList<>();
        a.add("访问瓦罐1");
        a.add(4654);
        aa.add(a);

        a = new ArrayList<>();
        a.add("访问瓦罐2");
        a.add(4654);
        aa.add(a);
        System.out.println(aa);


    }
}
