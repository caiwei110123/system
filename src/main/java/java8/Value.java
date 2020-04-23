package java8;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/9  上午10:51
 * @Version 1.0
 */
public class Value< T > {
    public static< T > T defaultValue() {
        return null;
    }

    public T getOrDefault( T value, T defaultValue ) {
        return ( value != null ) ? value : defaultValue;
    }
}