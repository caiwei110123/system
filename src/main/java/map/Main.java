package map;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/3/25  10:07 下午
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
          LinkedHashMap<String,Integer> map1=new LinkedHashMap<String,Integer>();

        map1.put("a",4);
        map1.put("b",1);
        map1.put("c",9);
        map1.put("d",11);
        map1.put("e",3);
        map1.put("f",6);
        map1.put("h",2);
        map1.put("j",22);
        map1.put("k",0);
        System.out.println(map1);
        System.out.println("================================================");
        map1 = a(map1);
        System.out.println(map1);


    }
    public static  LinkedHashMap<String,Integer>  a(  LinkedHashMap<String,Integer> map1){
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map1.entrySet());
        //降序排序
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        map1 = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> mapping:list) {
            map1.put(mapping.getKey(),mapping.getValue());
        }
        return map1;
    }
}

