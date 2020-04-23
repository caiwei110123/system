package annotation;

import java.lang.annotation.Annotation;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/7/24  下午4:39
 * @Version 1.0
 */
public class Test20171010{
    public static void main(String[] args) {
        Class<AppleTest> appleTestClass = AppleTest.class;
        try {
            AppleMethod show = appleTestClass.getMethod("show").getAnnotation(AppleMethod.class);
            //System.out.println(show.name());
            //System.out.println(show.sex());
            //System.out.println(show.phone());
            //System.out.println(show.age());
            //System.out.println("============");
            //System.out.println(appleTestClass.getDeclaredFields()[0].getName());
            AppleField show1 = appleTestClass.getDeclaredFields()[0].getAnnotation(AppleField.class);

            AppleLocalVariable a =  appleTestClass.getAnnotation(AppleLocalVariable.class);
            System.out.println(a);
            System.out.println(a.name());
            //System.out.println(show1.name());
            //System.out.println(show1.sex());
            //System.out.println(show1.phone());
            //System.out.println(show1.age());
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}