package tree.demo3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午3:31
 * @Version 1.0
 */
public class mainTest {

    public static List<String> types = new ArrayList<>();

    public static void main(String[] args) throws CloneNotSupportedException {
        List<Mutation> mutationList = new ArrayList<>();
        Mutation mutation = new Mutation();
        mutation.setType("CREATE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("MOVE_ORG");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("MOVE_ORG");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("DISMISS");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("CHANGE");
        mutationList.add(mutation);
        mutation = new Mutation();
        mutation.setType("DISMISS");
        mutationList.add(mutation);
        bubbleSort(mutationList);
    }

    private static void bubbleSort(List<Mutation> mutationList) throws CloneNotSupportedException {
        // 集合元素两两比较
        for (int i = 0; i < mutationList.size(); i++) {
            String previousMutation = null;
            String nextMutation = null;
            if (Objects.nonNull(mutationList.get(i))) {
                previousMutation = mutationList.get(i).getType();
            }
            if (i < mutationList.size() - 1 && Objects.nonNull(mutationList.get(i + 1))) {
                nextMutation = mutationList.get(i + 1).getType();
            }
            if (Objects.nonNull(previousMutation) && Objects.nonNull(nextMutation)) {
                // 根据前一个 mutation 和后一个 mutation 获取这2个 mutation 最终合并成说明类型的 mutation
                MergeMutationType mergeMutationType = ReorgMutationPatternsEnum.getMergeMutationType(previousMutation,
                    nextMutation);
                //最终的 mutation 可能有2个也可能只有一个
                String typeOne = mergeMutationType.getTerminalTypeOne();
                String typeTwo = mergeMutationType.getTerminalTypeTwo();
                // 如果最终第二个 mutation 是空，说明两个 mutation 按照规则最终合成一个 mutation
                if (Objects.nonNull(typeTwo)) {
                    //只生成 typeOne 的mutation，然后remove i
                    types.add(typeOne);
                    mutationList.remove(mutationList.get(i));
                    i--;
                } else {
                    //如果最终第二个 mutation 是都不为空，
                    //说明 previousMutation 和 nextMutation 需要合并，然后把2个同时删除，同时将后面有相同的 mutation 都合并。
                    types.add(typeOne);
                    mutationList.remove(mutationList.get(i));
                    //记录下第二个即将删除的 Mutation
                    Mutation previousDeleteTypeObj = (Mutation)mutationList.get(i).clone();
                    //mutationList.remove(mutationList.get(i));
                    boolean canDelete;
                    //循环判断刚刚删除的第二个 Mutation 后面的连续的 Mutation 是否有相同的，如果有，则删除，即合并。
                    do {
                        canDelete = judegIfDelete(mutationList, i, previousDeleteTypeObj);
                        if (canDelete) {
                            mutationList.remove(mutationList.get(i));
                        }
                    } while (canDelete);
                    i--;
                }

            } else {
                // 生成一条 firstStep 的 mutation
                if (!types.get(types.size()-1).equals(previousMutation)) {
                    types.add(previousMutation);
                }
            }
        }
        System.out.println(types);
    }

    /**
     * 只做一次 i 和 i+1 判断是否相等操作
     * @param mutationList
     * @param index
     * @param previousDeleteTypeObj
     * @return
     */
    private static boolean judegIfDelete(List<Mutation> mutationList, int index, Mutation previousDeleteTypeObj) {
        boolean result = false;
        if (index < mutationList.size() - 1 && Objects.equals(mutationList.get(index).getType(),
            previousDeleteTypeObj.getType())) {
            result = true;
        }
        return result;
    }

}
