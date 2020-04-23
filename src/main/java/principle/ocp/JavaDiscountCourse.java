package principle.ocp;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  12:22 上午
 * @Version 1.0
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Double getOriginPrice(){
        return super.getPrice();
    }
    public Double getPrice(){
        return super.getPrice() * 0.61;
    }
}