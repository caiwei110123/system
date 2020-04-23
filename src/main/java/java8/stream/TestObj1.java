package java8.stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/9  下午3:51
 * @Version 1.0
 */
@Data
public class TestObj1 {
    private String id;
    private String name;

    public TestObj1() {
    }

    public static TestObj1 aaa(TestObj testObj) {
        TestObj1 testObj1 = new TestObj1();
        testObj1.setId(testObj.getId());
        testObj1.setName(testObj.getName());
        return testObj1;
    }

    public static List<TestObj1> getTestObj1() {
        List<TestObj1> a =  new ArrayList<TestObj1>();
        return a;
    }

}
