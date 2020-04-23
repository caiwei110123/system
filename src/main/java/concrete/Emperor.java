package concrete;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午8:04
 * @Version 1.0
 */
public class Emperor extends Handler{
    //指定消息处理继承人
    private Handler successor;
    @Override
    public void handler(String msg) {
        System.out.println("皇帝直接处理了");
        //注意在这里就不在指派其他人了
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