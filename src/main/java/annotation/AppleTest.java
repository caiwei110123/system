package annotation;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/7/24  下午4:39
 * @Version 1.0
 */
public class AppleTest {

    @AppleField(name="9999999999999999")
    private String name ;


     @AppleMethod(name="张朵朵",age=1)
   public void show(){
         @AppleLocalVariable(name="EEEEEEEEEE")
         String name ;

     }
 }