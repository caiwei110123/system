package java8;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/8  下午10:29
 * @Version 1.0
 */
interface PersonFactory<P extends Person1> {
    P create(String firstName, String lastName);
}