package testm; 
/** 
*@author : yilie 
*@创建日期：2018年11月24日 上午12:34:23 
*@version Revision： 1.0.0
*@功能说明：
*/
public   class ValueAbsentException extends Throwable {
	 
	  public ValueAbsentException() {
	    super();
	  }
	 
	  public ValueAbsentException(String msg) {
	    super(msg);
	  }
	 
	  @Override
	  public String getMessage() {
	    return "No value present in the Optional instance";
	  }
	}

