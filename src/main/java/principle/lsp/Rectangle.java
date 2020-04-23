package principle.lsp;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2020/4/22  1:25 上午
 * @Version 1.0
 */
public class Rectangle {
    private long height;
    private long length;
    private long width;

    public void setHeight(long height) {
        this.height = height;
    }

    public long getHeight() {
        return height;
    }
    //@Override
    public long getWidth() {
        return width;
    }
    //@Override
    public long getLength() {
        return length;
    }
    public void setLength(long length) {
        this.length = length;
    }
    public void setWidth(long width) {
        this.width = width;
    }
}