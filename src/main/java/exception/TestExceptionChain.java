package exception;

import aa.json.test1;
import aa.json.test2;
import lombok.Data;

import java.util.Objects;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/5/14  下午4:13
 * @Version 1.0
 */
@Data
public class TestExceptionChain {

    private String abc ;
    private test1 test1;
    private test2 test2;

    public static void main(String[] args) {

        //Map<String,Object> m = new HashMap<>();
        //m.put("result",false);
        //System.out.println(Objects.equals(m.get("result"),true));
        //if (1==1){
        //    System.out.println(1);
        //}else
        //if (2==2){
        //    System.out.println(2);
        //}

        try {

            new TestExceptionChain().a(null);
            //new test().b(null);


        }catch (RuntimeExceptionSelf e) {
            System.out.println("RuntimeExceptionSelf: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("exception: "+e.getMessage());
        }
        System.out.println("end");
    }

    public String a(String a){

       // int aa = 1/0;
            if (Objects.isNull(a)) {
                throw new RuntimeExceptionSelf("a");
            }
        return "a";
    }

    public String b(String a){
        try {
        //    int aa = 1/0;
            if (Objects.isNull(a)) {
                throw new RuntimeExceptionSelf("b");
            }

        } catch (RuntimeExceptionSelf e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("系统错误");
        }
         return "b";
    }

}
