package aa;

import com.alibaba.fastjson.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/5/12  下午5:28
 * @Version 1.0
 */
public class test11 {
    public static String a;
    public static final String TOPIC = "TOPIC";
    static {
        a = "123";

    }
    private  static  void test(){
        System.out.println(22);
    }
    public static  Date parse(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(strDate);
    }
    public static  int getAge(Date birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) { //出生日期晚于当前时间，无法计算
            throw new IllegalArgumentException(
                "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);  //当前年份
        int monthNow = cal.get(Calendar.MONTH);  //当前月份
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); //当前日期
        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;   //计算整岁数
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;//当前日期在生日之前，年龄减一
            }else{
                age--;//当前月份在生日之前，年龄减一
            } } return age;
    }
    public static void main(String[] args) throws InterruptedException {
        String workNo = "019123";
        System.out.println(Long.valueOf(workNo));
        workNo = String.valueOf(Long.valueOf(workNo));
        System.out.println(workNo);




        Map<String,String> map = new HashMap<>();
        map.put("a","a");
        map
            .put("b","b");
        System.out.println(JSONObject.toJSONString(map));
        int aaa = 96;
        System.out.println(String.valueOf(aaa).length());

        try {
            int  age = getAge(parse("1995-12-12 00:00:00"));           //由出生日期获得年龄***
            System.out.println("age:"+age);
        } catch (Exception e) {
            e.printStackTrace();
        }



        String a = null;
        String b = "123";
        if (Objects.equals(a,b)) {
            //System.out.println(1);
        }else {
            //System.out.println(2);
        }
       //String str = "id,gmt_create,gmt_modified,tenant_id,creator_id,creator_nick,reorg_event_id,type,context,"
       //    + "description,mutation_id\n"
       //    + "\"109\",\"2019-12-05 10:07:36\",\"2019-12-05 10:07:36\",\"2\",\"3\",\"詹黎明\","
       //    + "\"hrreorgevent9j5xK52Awk2R\",\"CREATE\",\"{\\\"name\\\": \\\"111\\\", \\\"level\\\": {\\\"id\\\": "
       //    + "\\\"hrorghierdec55a46a168408ea8e235d1efcbe81f\\\", \\\"name\\\": \\\"类目\\\"}, \\\"owner\\\": "
       //    + "{\\\"id\\\": \\\"hrposition50f5c14d60c742b6a181629da63a8477\\\", \\\"staff\\\": {\\\"id\\\": "
       //    + "\\\"hrstaffd62fe5a2f73e42a789801dcc176ea3e2\\\", \\\"name\\\": \\\"侯涛\\\", \\\"workNo\\\": "
       //    + "\\\"WB332941\\\"}}, \\\"parentId\\\": \\\"hrom7ad595b4fb44481fbf987f84d55af5b9\\\", \\\"orgTypeId\\\": "
       //    + "\\\"ORGANIZATIONAL_ORG\\\", \\\"orgUnitId\\\": \\\"hrom9K4xaZw0XjqN\\\"}\",\"创建组织: 111\","
       //    + "\"ommutationwYPbLOO6Lp10\"\n"
       //    + "\"111\",\"2019-12-05 10:07:54\",\"2019-12-05 10:07:54\",\"2\",\"3\",\"詹黎明\","
       //    + "\"hrreorgevent9j5xK52Awk2R\",\"DISMISS\",\"{\\\"parentId\\\": "
       //    + "\\\"hrom7ad595b4fb44481fbf987f84d55af5b9\\\", \\\"orgUnitId\\\": \\\"hrom9K4xaZw0XjqN\\\"}\",\"删除组织: "
       //    + "111\",\"ommutation8QXErJ7G4a6P\"\n"
       //    + "\"113\",\"2019-12-05 10:48:38\",\"2019-12-05 10:48:38\",\"2\",\"3\",\"詹黎明\","
       //    + "\"hrreorgevent9j5xK52Awk2R\",\"DISMISS\",\"{\\\"parentId\\\": "
       //    + "\\\"hrom43c45603d95f462882fdcd8d45b4b007\\\", \\\"orgUnitId\\\": "
       //    + "\\\"hrom4dcedd6caa104b4ea29b5465c2a2dbcd\\\"}\",\"删除组织: 猫超软通AG退款\",\"ommutation0WlO4AgpLj98\"\n"
       //    + "\"115\",\"2019-12-05 10:48:44\",\"2019-12-05 10:48:44\",\"2\",\"3\",\"詹黎明\","
       //    + "\"hrreorgevent9j5xK52Awk2R\",\"DISMISS\",\"{\\\"parentId\\\": "
       //    + "\\\"hrom43c45603d95f462882fdcd8d45b4b007\\\", \\\"orgUnitId\\\": "
       //    + "\\\"hrom4dcedd6caa104b4ea29b5465c2a2dbcd\\\"}\",\"删除组织: 猫超软通AG退款\",\"ommutationRKOZ43b5rnY0\"\n";

        //List<Date> list = new ArrayList<>();
        //list.add(new Date());
        //Thread.sleep(1000*2);
        //list.add(new Date());
        //list.sort(new Comparator<Date>() {
        //    @Override
        //    public int compare(Date o1, Date o2) {
        //        return o2.compareTo(o1);
        //    }
        //});
        //System.out.println(list.toString());
    }
}
