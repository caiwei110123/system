package tree.demo3;

import lombok.Getter;

import java.util.Objects;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午2:36
 * @Version 1.0
 */
public enum ReorgMutationPatternsEnum {

    /**
     *
     */
    MOVE_ORG_TO_MOVE_ORG("MOVE_ORG", "MOVE_ORG","MOVE_ORG","MOVE_ORG"),
    /**
     *
     */
    MOVE_ORG_TO_CHANGE("MOVE_ORG", "CHANGE","MOVE_ORG","CHANGE"),
    /**
     *
     */
    MOVE_ORG_TO_DISMISS("MOVE_ORG", "DISMISS","MOVE_ORG","DISMISS"),
    /**
     *
     */
    CHANGE_TO_DISMISS("CHANGE", "DISMISS","CHANGE","DISMISS"),
    /**
     *
     */
    CHANGE_TO_MOVE_ORG("CHANGE", "MOVE_ORG","CHANGE","MOVE_ORG"),

    /**
     *
     */
    CHANGE_TO_CHANGE("CHANGE", "CHANGE","CHANGE",null),


    /**
     *
     */
    DISMISS_TO_CHANGE("DISMISS", "CHANGE","DISMISS","CHANGE"),
    /**
     *
     */
    DISMISS_TO_DISMISS("DISMISS", "DISMISS","DISMISS",null),
    /**
     *
     */
    CREATE_TO_MOVE_ORG("CREATE", "MOVE_ORG","CREATE",null),
    /**
     *
     */
    CREATE_TO_DISMISS("CREATE", "DISMISS","DISMISS",null),
    /**
     *
     */
    CREATE_TO_CHANGE("CREATE", "CHANGE","CREATE",null);

    @Getter
    private String beginType;

    @Getter
    private String endType;

    @Getter
    private String terminalTypeOne;

    @Getter
    private String terminalTypeTwo;

    ReorgMutationPatternsEnum(String beginType, String endType, String terminalTypeOne, String terminalTypeTwo) {
        this.beginType = beginType;
        this.endType= endType;
        this.terminalTypeOne= terminalTypeOne;
        this.terminalTypeTwo= terminalTypeTwo;
    }

    public static MergeMutationType getMergeMutationType(String beginType, String endType){
        MergeMutationType mergeMutationType = null;
        ReorgMutationPatternsEnum [] reorgMutationPatternsEnums = ReorgMutationPatternsEnum.values();
        for (ReorgMutationPatternsEnum temp : reorgMutationPatternsEnums) {
            if (Objects.equals(temp.beginType,beginType) && Objects.equals(temp.endType,endType)) {
                mergeMutationType = new MergeMutationType();
                mergeMutationType.setTerminalTypeOne(temp.terminalTypeOne);
                mergeMutationType.setTerminalTypeTwo(temp.terminalTypeTwo);
                mergeMutationType.setBeginType(beginType);
                mergeMutationType.setEndType(endType);

            }
        }
        return mergeMutationType;
    }
}
