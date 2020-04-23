package java8;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/15  上午10:19
 * @Version 1.0
 */
public class JudgeNull {

    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("123");
        person.setFlag(true);
        //Person person1 = null;
        Integer id =  Optional.ofNullable(person).filter(obj -> obj != null)
                                     .filter(obj -> obj.getFlag()==true)
                                      .map(Person::getId).orElse(null);
        //System.out.println(id);

        String jobId = "1";
        jobId = Optional.ofNullable(jobId).map(jobId1 -> {
            return "12";
        }).orElse(null);
        System.out.println(jobId);



    }
}
