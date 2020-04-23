package concrete;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午8:03
 * @Version 1.0
 */
public class Soilder extends Handler{
    //指定消息处理继承人
    private Handler successor;
    @Override
    public void handler(String msg) {
        System.out.println("士兵没有权利处理，交给上司");
        this.successor.handler(msg);
    }
    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    @Override
    public Handler getSuccessor() {
        return successor;
    }
}
