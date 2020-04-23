package java8;

import lombok.Data;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/8  下午10:29
 * @Version 1.0
 */
@Data
class Person1 {
    String firstName;
    String lastName;

    Person1() {}

    Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Person1 a(Person s) {

        return new Person1("a","b");
    }

}