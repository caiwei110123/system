package strageState;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/30  上午11:39
 * @Version 1.0
 */
/**
 * 定义电梯的状态：打开、关闭、运行、停止
 */
interface LiftState {
    void open();

    void close();

    void run();

    void stop();
}