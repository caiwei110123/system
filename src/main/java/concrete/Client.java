package concrete;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午8:04
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //这里的client就相当于前线将军
        String msg = "前线战况紧急，请求支援";
        Soilder soilder=new Soilder();
        Minister minister = new Minister();
        Emperor emperor = new Emperor();
        //为每一级别指定继承者
        soilder.setSuccessor(minister);
        minister.setSuccessor(emperor);
        //第一级别执行
        soilder.handler(msg);
    }
}
