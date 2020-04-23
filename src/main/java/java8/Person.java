package java8;

import lombok.Data;

import java.util.function.Function;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/8  下午8:21
 * @Version 1.0
 */

@Data
public class Person {

    Person1 person1;
    private Integer id;
    private String name;
    private Integer score;
    private Boolean flag ;
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", score=" + score + "]";
    }

}