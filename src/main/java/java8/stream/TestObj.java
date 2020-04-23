package java8.stream;

import java.util.Optional;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/9  下午3:51
 * @Version 1.0
 */
@Data
public class TestObj {
    public static void main(String[] args) {
        // 参数
        String paramStr = "12";
        Optional.ofNullable(paramStr).filter(param -> param != null)
                              .filter(param -> StringUtils.isEmpty(paramStr))
                              .ifPresent(param -> {
                                   //参数重新复制
                                   System.out.println(123);
                              });
    }
    private String id;
    private String name;

}
