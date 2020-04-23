package tree.demo2;

import lombok.Data;

import java.util.Collection;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/12/4  下午12:12
 * @Version 1.0
 */
@Data
public class Tree {
    private Number id;
    private Number pid;
    private Collection childs;
}
