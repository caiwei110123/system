package strageState;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/9/30  上午11:40
 * @Version 1.0
 */
class Test3 {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(new OpenState(lift));
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}