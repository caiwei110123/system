package principle.LodLKP;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  1:13 上午
 * @Version 1.0
 */
public class LoDTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
