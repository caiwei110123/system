package abs;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/13  上午3:11
 * @Version 1.0
 */
public class selfclass extends absclass {


    @Override
    public void aaa() {
        super.aaa();
        System.out.println("selfclass---aaa");
    }

    public static void main(String[] args) {
        selfclass s = new selfclass();
        s.aaa();
    }
}
