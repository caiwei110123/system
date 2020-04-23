package principle.dip;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  12:28 上午
 * @Version 1.0
 */
public class Tom {
    private ICourse course;
    public Tom(){
    }
    public Tom(ICourse course){
        this.course = course;
    }
    public void study(){
        course.study();
    }
    public void study(ICourse course){
        course.study();
    }
    public void setCourse(ICourse course) {
        this.course = course;
    }
    public void studyJavaCourse(){
        System.out.println("Tom 在学习 Java 的课程");
    }
    public void studyPythonCourse(){
        System.out.println("Tom 在学习 Python 的课程");
    }
}