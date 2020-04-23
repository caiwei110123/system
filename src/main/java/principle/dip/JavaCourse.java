package principle.dip;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  12:31 上午
 * @Version 1.0
 */
public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("Tom 在学习 Java 课程");
    }
}