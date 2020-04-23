package abs;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/13  下午1:25
 * @Version 1.0
 */
public class b1 extends  a {
    @Override
    public void test() {
        System.out.println("b1");
    }

    public static void main(String[] args) {
        BigDecimal bi1 = new BigDecimal(5);
        BigDecimal bi2 = new BigDecimal(30);

        BigDecimal divide = bi1.divide(bi2, 4, RoundingMode.HALF_UP);
        //System.out.println(divide.doubleValue());
        //System.out.println(divide.doubleValue()*100);

        DecimalFormat df = new DecimalFormat("0.00%");
        String percent=df.format(divide);
        System.out.println(percent);

    }
}
