package principle.dip;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  12:29 上午
 * @Version 1.0
 */
public class DIPTest {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.studyJavaCourse();
        tom.studyPythonCourse();

        tom = new Tom();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());

        System.out.println("========");
        tom = new Tom(new JavaCourse());
        tom.study();
        tom.setCourse(new PythonCourse());
        tom.study();
    }
}
