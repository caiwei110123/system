package concrete;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午8:03
 * @Version 1.0
 */
public abstract class Handler {
    protected Handler successor;
    public abstract void handler(String  msg);
    public abstract void setSuccessor(Handler successor);
    public abstract Handler getSuccessor();
}
