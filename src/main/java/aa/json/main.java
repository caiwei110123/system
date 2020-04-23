package aa.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/24  下午4:10
 * @Version 1.0
 */
public class main {
    public static void main(String[] args) {

        String person = null;
        System.out.println(StringUtils.isBlank(person));// true

        person = "";
        System.out.println(StringUtils.isBlank(person));// true

        //List<String> list = new ArrayList<>();
        //list.add("1");
        //list.add("2");
        //list.add("3");
        //list.add("4");
        //list.add("5");
        //list.add("6");
        //
        //list.stream().forEach(s -> {
        //    s = "e";
        //});
        //System.out.println(list);


        String  a = "[{\"id\": \"103\", \"name\": \"一线客服（外语类）\", \"parentId\": \"-1\"}, {\"id\": \"170\", \"name\": "
            + "\"test\", \"parentId\": \"103\"}]";
        JSONObject j = new JSONObject();
        JSONArray aa =  JSONArray.parseArray(a);
        j.put("to",aa);
        System.out.println(j);

        //String a = "@0001";
        //System.out.println(a.substring(1,a.length()));
        //int aa = Integer.parseInt("0001")+1;
        //System.out.println(aa);
        //DecimalFormat decimalFormat=new DecimalFormat("0000");
        //System.out.println(decimalFormat.format(aa));
        //StringBuffer s = new StringBuffer();
        //s.append("1").append(",").append("2").append(",");
        //System.out.println(s.delete(s.length()-1,s.length()));
        //Long a = 1577789516278L;
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //
        //Calendar  calendar = Calendar.getInstance();
        //calendar.add(Calendar.MINUTE,6);
        //System.out.println(sdf.format(calendar.getTime()));
        //System.out.println(calendar.getTimeInMillis());

        //Set<String> set = new HashSet<>();
        //set.add("1");
        //set.add(null);
        //System.out.println(set.size());
       // test1 test1 = new test1();
       // test1.setA1("testa1");
       // test1.setB1("testb1");
       //
       // test2 test2 = new test2();
       // test2.setA2("testa2");
       // test2.setB2("testb2");
       //
       //
       // test test = new test();
       // test.setTest1(test1);
       // test.setTest2(test2);
       // test.setAbc("abc");
       //// System.out.println(JSONObject.toJSONString(test));
       // String str = JSONObject.toJSONString(test);
       //
       // //从 db 读
       // myobj myobj = new myobj();
       // myobj.setContext(str);
       // System.out.println(myobj.toString());
       // //转对象
       // myobj.setTest(JSON.parseObject(myobj.getContext()));
       // System.out.println("=====");
       // System.out.println(myobj);
       //



        //myobj myobj = JSONObject.parseObject(str, aa.json.myobj.class);
        //System.out.println(myobj.toString());



    }
}
