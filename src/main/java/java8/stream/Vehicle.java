package java8.stream;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/1/9  上午10:58
 * @Version 1.0
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    //车架号
    private String vin;
    // 车主手机号
    private String phone;
    // 车主姓名
    private String name;
    // 所属车租车公司
    private Integer companyId;
    // 个人评分
    private Double score;
    //安装的设备列表imei,使用逗号分隔
    private String deviceNos;


    public static String aaa(){
       return "aaa";
    }
    public void a(){
        System.out.println("a");
    }

    public static void a(String s) {
        System.out.println(s+ "   a"     );
    }
}