package principle.srp;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  12:53 上午
 * @Version 1.0
 */
public interface ICourse {
    //获得基本信息
    String getCourseName();
    //获得视频流
    byte[] getCourseVideo();
    //学习课程
    void studyCourse();
    //退款
    void refundCourse();
}