package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/9  下午3:51
 * @Version 1.0
 */
public class testmain2 {
    public static void main(String[] args) {
        List<TestObj> list = new ArrayList<>();
        TestObj testObj = new TestObj();
        testObj.setId("1");
        testObj.setName("1-1");
        list.add(testObj);
        testObj = new TestObj();
        testObj.setId("2");
        testObj.setName("2-2");
        list.add(testObj);



        List<TestObj1> list12 = null;


        List<TestObj1> testObj1List = Optional.ofNullable(list).orElse(new ArrayList<>()).stream().map(TestObj1::aaa).collect(Collectors.toList());

            //orElse(new ArrayList<>()).stream().map(TestObj1::aaa).collect(Collectors.toList());
        System.out.println(testObj1List.toString());





        List<TestObj> list1 = new ArrayList<>();

        //
        Vehicle vehicle = new Vehicle();
        Optional.ofNullable(list1).filter((valueList) -> valueList.size() > 0).ifPresent((count) -> {
            vehicle.setCompanyId(12321);
            System.out.println(123222);
        });
        //
        //System.out.println("comp  "+vehicle.toString());
        //
        //Optional.ofNullable(list1).ifPresent((valueList) -> {
        //    System.out.println(44444);
        //});


        //
        //Optional.ofNullable(list).filter((valueList) -> valueList.size() > 0).ifPresent((valueList) -> {
        //    System.out.println(valueList.size());
        //});
        //
        //
        //
        Optional.ofNullable(list).ifPresent((valueList) -> System.out.println(valueList.size()));
        //boolean isPresent = Optional.ofNullable(list1).isPresent();
        //    Integer optionalInteger = Optional.ofNullable(list1.size()).filter((size) -> size > 0).orElse(0);
        //System.out.println(optionalInteger);
        //
        //
        Object a = Optional.ofNullable(list1).map((valueList) -> {
            System.out.println(123);
            return null;
        }).orElse(1);
        //System.out.println(a);
    }
}
