//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.TypeReference;
//
///**
// *@author : yilie
// *@创建日期：2019年4月10日 下午4:12:44
// *@version Revision： 1.0.0
// *@功能说明：根据层级和key，获取对应的数据源
// */
//public class jsontest {
//	private static final String JSONSTR =
//			"{\n" +
//			" \"code_desc\": [{\"data\":[{\"rhine\":1,\"b\":2},{\"rhine\":55,\"b\":4}],\"2\":0,\n" +
//			"\"data\":[{\"rhine\":1, \"ccc\":{\"rhine\":1,\"b\":2,\"result\":[{\"rhine\":1,\"b\":33},{\"rhine\":21},{\"rhine\":3},{\"rhine\":4},{\"rhine\":5}],\"b\":22}}],\"result\":\"查到结果result\",\"BillDemainEventSubscriber\":{\"3c\":\"1\",\"b\":\"3\"}},{\"2\":0,\"result_desc\":\"查到结果\"}] \n" +
//			"}";
//	public static void main(String[] args) {
//		System.out.println(JSONSTR);
//		String str = "[{\"sysCode\":\"\",\"data\":{\"form\":{\"ccccc\":2,\"xxx\":1},\"table\":[{\"rhine\":1,\"b\":1},{\"rhine\":1,\"b\":2}]},\"success\":true}]";
//		JSONArray arr = JSON.parseArray(str);
//		String dataSourceKeyWord = "ccc";
//		int dataSourceLayer = 3;
//		Map<String,Map<String,String>> res = new LinkedHashMap<>();
//		new jsontest().BillDemainEventSubscriber(dataSourceLayer,dataSourceKeyWord,res,JSONSTR,1,0);
//		System.out.println(res.toString());
//	}
//
//	private   void BillDemainEventSubscriber(int dataSourceLayer,String dataSourceKeyWord,Map<String,Map<String,String>> res,String str,int type,int layer) {
//		layer++;
//		Map<String,String> temp = null;
//		String ds = "";
//		if(type==1) {
//			Map<String, Object> jsonMap = JSON.parseObject(str, new TypeReference<LinkedHashMap<String, Object>>() {
//			});
//			for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
//				Object value = entry.getValue();
//				String key = entry.getKey();
//				String valString = value==null?"":value.toString();
//				if( (valString.startsWith("{")&&valString.endsWith("}"))) {
//					putMapInfo(dataSourceLayer,dataSourceKeyWord,res,layer,key,valString);
//					BillDemainEventSubscriber(dataSourceLayer,dataSourceKeyWord,res,valString,1,layer);
//				}else if( (valString.toString().startsWith("[{")&&valString.endsWith("}]"))) {
//					putMapInfo(dataSourceLayer,dataSourceKeyWord,res,layer,key,valString);
//					BillDemainEventSubscriber(dataSourceLayer,dataSourceKeyWord,res,valString,2,layer);
//				}else {
//					putMapInfo(dataSourceLayer,dataSourceKeyWord,res,layer,key,valString);
//				}
//			}
//		}else if(type==2) {
//			System.out.println(str);
//			List<Map> jsonList =  JSON.parseArray(str,  Map.class);
//			for(Map map : jsonList) {
//				Iterator it = 	map.entrySet().iterator();
//				while(it.hasNext()) {
//					Entry entry = (Entry) it.next();
//					Object key = entry.getKey();
//					Object val = entry.getValue();
//					String valStr = val==null?"":val.toString();
//					if( (valStr.toString().startsWith("[{")&&valStr.endsWith("}]"))) {
//						putMapInfo(dataSourceLayer,dataSourceKeyWord,res,layer,key.toString(),valStr);
//						BillDemainEventSubscriber(dataSourceLayer,dataSourceKeyWord,res,valStr,2,layer);
//					}else if( (valStr.startsWith("{")&&valStr.endsWith("}"))) {
//						putMapInfo(dataSourceLayer,dataSourceKeyWord,res,layer,key.toString(),valStr);
//						BillDemainEventSubscriber(dataSourceLayer,dataSourceKeyWord,res,valStr,1,layer);
//					}else {
//						putMapInfo(dataSourceLayer,dataSourceKeyWord,res,layer,key.toString(),valStr);
//					}
//				}
//			}
//		}
//	}
//	private void putMapInfo(int dataSourceLayer,String dataSourceKeyWord,
//			Map<String,Map<String,String>> res,int layer,String key,String valString) {
//		Map temp = null;
//		if(layer==dataSourceLayer && key.equals(dataSourceKeyWord)) {
//			if(res.size()==0) {
//				temp = new HashMap<>();
//				temp.put(key.toString(), valString);
//				res.put(layer+"", temp);
//			}else {
//				 temp = res.get(layer+"");
//				if(temp==null) {
//					temp = new HashMap<>();
//				}
//				temp.put(key, valString);
//				res.put(layer+"", temp);
//			}
//		}
//
//
//	}
//}
//
//
