package java8;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/8  下午10:01
 * @Version 1.0
 */
public interface interface1 {
    void method1(String str);
    //void method2(String str);

    default void log(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        interface1 interface1 = (str) -> System.out.println(str);
        interface1.method1("11");
        //new interface1impl().method1("123");
    }
}
