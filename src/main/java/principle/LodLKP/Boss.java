package principle.LodLKP;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  1:12 上午
 * @Version 1.0
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        //模拟 Boss 一页一页往下翻页， TeamLeader 实时统计
        List<Course> courseList = new ArrayList<Course>();
        for (int i= 0; i < 20 ;i ++){
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }
}