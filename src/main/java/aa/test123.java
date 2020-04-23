package aa;

import aa.json.obj;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/11/12  下午12:12
 * @Version 1.0
 */
public class test123 {
    public static void main(String[] args) {
        //String a = "{\n"
        //    + "    \"bizType\":0,\n"
        //    + "    \"candidateId\":\"candidateId47279052881942d093db4b33f87ca0fd\",\n"
        //    + "    \"candidateList\":[\n"
        //    + "        \"candidateId47279052881942d093db4b33f87ca0fd\"\n"
        //    + "    ],\n"
        //    + "    \"jobRequisitionId\":\"jobrequisitionId04c6031a9a9e4e8fb31c131fa5d5430a\"\n"
        //    + "}";

        List<obj> list = new ArrayList<>();
        obj o  = new obj();
        o.setA("1");
        list.add(o);
        o  = new obj();
        o.setA("2");
        list.add(o);
        System.out.println(list);
        list.stream().forEach(obj -> {
            obj.setA("xxx");
        });
        System.out.println(list);
    }
}
