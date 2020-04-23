package tree.demo2;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午12:13
 * @Version 1.0
 */
public class test{

    public static void main(String[] args) {
        System.out.println("1111111111111111111111");
        List<MyTree> trees = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            MyTree myTree = new MyTree();
            myTree.setName("顶级"+i);
            myTree.setId(i);
            myTree.setPid(0);
            trees.add(myTree);
            for (int j = 11; j <100 ; j++) {
                MyTree myTree1 = new MyTree();
                myTree1.setName("子级"+j);
                myTree1.setId(j);
                myTree1.setPid(i);
                trees.add(myTree1);
            }
        }
        System.out.println(trees);
        System.out.println("222222222222222222222");
        Collection<MyTree> tree = new TreeFactory<MyTree>().createTree(trees);
        System.out.println(JSONObject.toJSONString(tree));
        System.out.println("3333333333333333333333333");
    }
}
