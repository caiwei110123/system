package java8;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/8  下午10:01
 * @Version 1.0
 */
public class interface1impl implements interface1 {
    @Override
    public void method1(String str) {
        log(str);
    }


    public static void main(String[] args) {
        interface1 interface1 = (str1) -> System.out.println(str1);
        interface1.method1("11");
        //new interface1impl().method1("123");
    }
}
