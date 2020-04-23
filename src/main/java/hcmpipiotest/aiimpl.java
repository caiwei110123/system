package hcmpipiotest;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/30  下午5:59
 * @Version 1.0
 */
public class aiimpl extends abs implements ai {


    @Override
    public String test() {
        absmap.put("abs-1`","abs-1");
        System.out.println(absmap);
        return "aiimpl";
    }
}
