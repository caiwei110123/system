package aa.abs;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/5/12  下午10:49
 * @Version 1.0
 */
public class maintest {
    public static void main(String[] args) {
        System.out.println(11);
        Integer a = 1;
        System.out.println(a);
        Integer aa = new Integer(1);
        System.out.println(333);
        String subJobCode = "s10009";
        int jobCodeLength = subJobCode.length();
        subJobCode = subJobCode.substring(1,jobCodeLength);
        int subJobCodeInt = Integer.parseInt(subJobCode);
        subJobCodeInt += 1;
        DecimalFormat decimalFormat=new DecimalFormat("00000");

        System.out.println("s"+decimalFormat.format(subJobCodeInt));
        //String prefix = "yilie";
        //String fix = "Abs";
        //try {
        //    System.out.println("aiimpl.abs."+prefix+fix);
        //    Class<?> absUser = Class.forName("aiimpl.abs."+prefix+fix);
        //    Method method = absUser.getMethod("BillDemainEventSubscriber",null);
        //    Object res = method.invoke(absUser.newInstance());
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}
    }
}
