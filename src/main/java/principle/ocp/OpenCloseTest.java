package principle.ocp;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  12:25 上午
 * @Version 1.0
 */
public class OpenCloseTest {
    public static void main(String[] args) {
        //这是最基本的调用接口
        ICourse iCourse = new JavaCourse(1,"test",2.0);
        System.out.println(iCourse.getPrice());
        //现在要要求返回的price打八折,又不改之前的代码
          iCourse = new JavaDiscountCourse(1,"test",2.0);
        System.out.println(iCourse.getPrice());
    }
}
