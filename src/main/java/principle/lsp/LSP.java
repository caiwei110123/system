package principle.lsp;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  1:29 上午
 * @Version 1.0
 */
public class LSP {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() >= rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:"+rectangle.getWidth() + ",height:"+rectangle.getHeight());
        }
        System.out.println("resize 方法结束" +
            "\nwidth:"+rectangle.getWidth() + ",height:"+rectangle.getHeight());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);
    }
}
