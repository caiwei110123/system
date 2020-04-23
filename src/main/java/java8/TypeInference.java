package java8;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/9  上午10:51
 * @Version 1.0
 */
public class TypeInference {
    public static void main(String[] args) {
        final Value< String > value = new Value<>();
        String a = value.getOrDefault( null, Value.defaultValue() );
        System.out.println(a);
    }
}
