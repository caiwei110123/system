package designpattern.singleton.lazy;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  9:42 下午
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        System.out.println("11111");
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println("22222");
        System.out.println("555    "+singleton.toString());

    }
}
