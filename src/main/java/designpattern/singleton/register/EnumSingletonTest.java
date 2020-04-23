package designpattern.singleton.register;

import designpattern.factory.JavaCourse;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  10:12 下午
 * @Version 1.0
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.getInstance();
        singleton.setData(new JavaCourse());
        JavaCourse javaCourse = (JavaCourse)singleton.getData();
        javaCourse.record();
        System.out.println(singleton);
    }
}
