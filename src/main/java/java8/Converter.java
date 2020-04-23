package java8;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/8  下午10:34
 * @Version 1.0
 */
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}