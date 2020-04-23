package principle.srp;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  12:51 上午
 * @Version 1.0
 */
public class srpTest {
    public static void main(String[] args) {
        Course course = new Course();
        course.study("直播课");
        course.study("录播课");
        System.out.println("======");

        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");
        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
