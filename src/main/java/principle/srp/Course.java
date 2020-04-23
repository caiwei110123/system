package principle.srp;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  12:50 上午
 * @Version 1.0
 */
public class Course {
    public void study(String courseName){
        if("直播课".equals(courseName)){
            System.out.println(courseName + "不能快进");
        }else{
            System.out.println(courseName + "可以反复回看");
        }
    }
}