package bityunsuan;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/18  下午10:28
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        System.out.println(16  << 1);

        System.out.println(16 >> 1);
        System.out.println("====");

        System.out.println(16 << 1);
        System.out.println(16 >>> 1);
        System.out.println("====");
        int n  =16;
        System.out.println( (n <<1)  - (n>>>1));
        System.out.println("=====");
 int a = 16;
        System.out.println(15&9);
        System.out.println(31&9);
        System.out.println(63&9);

        System.out.println(31&20);
        System.out.println(15&60);
        System.out.println(31&60);


    }
}