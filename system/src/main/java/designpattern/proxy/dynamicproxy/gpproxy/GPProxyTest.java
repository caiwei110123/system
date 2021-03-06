package designpattern.proxy.dynamicproxy.gpproxy;


import designpattern.proxy.Person;
import designpattern.proxy.dynamicproxy.jdkproxy.Girl;

import java.io.FileOutputStream;

/**
 * .
 */
public class GPProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
