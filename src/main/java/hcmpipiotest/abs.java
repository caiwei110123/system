package hcmpipiotest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/10/30  下午5:58
 * @Version 1.0
 */
public abstract class abs  {
  public   volatile Map<String,String>  absmap = new ConcurrentHashMap<String, String>();

}
