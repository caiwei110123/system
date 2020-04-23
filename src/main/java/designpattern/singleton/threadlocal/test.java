package designpattern.singleton.threadlocal;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  11:05 下午
 * @Version 1.0
 */
public class test {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        try {
        } catch (Exception e) {

        }
    }
}


