///**
//*@author : yilie
//*@创建日期：2019年4月10日 下午4:58:00
//*@version Revision： 1.0.0
//*@功能说明：
//*/
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.TypeReference;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class JsonAnalysisTest {
//
//
//    /**
//     * Json格式如下:
//     */
//    //对象型
//    private static final String JSON_OBJ_STR = "{\"studentName\":\"lily\",\"studentAge\":12}";
//    //数组类型
//    private static final String JSON_ARRAY_STR = "[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]";
//    //复杂格式json字符串
//    private static final String COMPLEX_JSON_STR = "{\"teacherName\":\"crystall\",\"teacherAge\":27,\"course\":{\"courseName\":\"english\",\"code\":1270},\"students\":[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]}";
//    private static final String JSONSTR =
//    		"{\n" +
//    		" \"code_desc\": [{\"2\":0,\n" +
//    		"\"data\":[{\"rhine\":1}],\"result\":\"查到结果result\",\"BillDemainEventSubscriber\":{\"3c\":\"1\",\"b\":\"3\"}},{\"2\":0,\"result_desc\":\"查到结果\"}] \n" +
//    		"}";
//
////    		"{\n" +
////            "    \"code\": \"200\",\n" +
////            "    \"code_desc\": [{\"2\":0,\"result_desc\":\"查到结果1\",\"BillDemainEventSubscriber\":{\"3c\":\"1\",\"b\":\"3\"}},{\"2\":0,\"result_desc\":\"查到结果\"}],\n" +
////            "    \"charge\": true,\n" +
////            "    \"data\": { \n" +
////            "    \"result_code\": 0,\n" +
////            "         \"result_desc\": {\"result_code\":0,\"result_desc\":\"查到结果\"}\n" +
////            "     }\n" +
////            "}";
//
//    /**
//     * json字符串-简单对象型与JSONObject之间的转换
//     */
//    public void testJSONStrToJSONObject() {
//        JSONObject jsonObject = JSON.parseObject(JSON_OBJ_STR);
//        //JSONObject jsonObject1 = JSONObject.parseObject(JSON_OBJ_STR); //因为JSONObject继承了JSON，所以这样也是可以的
//        System.out.println(jsonObject.getString("studentName") + ":" + jsonObject.getInteger("studentAge"));
//    }
//
//    /**
//     * json字符串-数组类型与JSONArray之间的转换
//     */
//    public void testJSONStrToJSONArray() {
//        JSONArray jsonArray = JSON.parseArray(JSON_ARRAY_STR);
//        //JSONArray jsonArray1 = JSONArray.parseArray(JSON_ARRAY_STR);//因为JSONArray继承了JSON，所以这样也是可以的
//        for (int i = 0; i < jsonArray.size(); i++) {
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//            System.out.println(jsonObject.getString("studentName") + ":" + jsonObject.getInteger("studentAge"));
//        }
//    }
//
//    /**
//     * 复杂json格式字符串与JSONObject之间的转换
//     */
//    public void testComplexJSONStrToJSONObject() {
//        JSONObject jsonObject = JSON.parseObject(COMPLEX_JSON_STR);
//        //JSONObject jsonObject1 = JSONObject.parseObject(COMPLEX_JSON_STR);//因为JSONObject继承了JSON，所以这样也是可以的
//        String teacherName = jsonObject.getString("teacherName");
//        Integer teacherAge = jsonObject.getInteger("teacherAge");
//        JSONObject course = jsonObject.getJSONObject("course");
//        JSONArray students = jsonObject.getJSONArray("students");
//    }
//
//    private static <T> String[] analysisJsonByCondition(String jsonStr, String[] strings) {
//        // 0.根据传过来的数据 用json自带方法进行解析
//        // 1.根据条件依次解析
//        return null;
//    }
//
//
//    /**
//     * The entry point of application.
//     */
////    public void testAnalysisJson() {
////        UserCouponCondition t = new UserCouponCondition();
////        analysis(JSONSTR, t);
////    }
//
//    public static void main(String[] args) {
//    	System.out.println(JSONSTR);
//    	 analysis(JSONSTR, null);
//	}
//    /**
//     * The Layer.
//     */
//    static int layer = 1;//默认为第一层级
//
//    /**
//     * 根据条件获取json中的<code>key</code>||<code>value</code>
//     *
//     * @param jsonStr   需要遍历的 Json字符串
//     * @param condition 条件  <p>层级说明：以 "{" or "[{" 的开头 为一层级, 依次累加</p>
//     * @param <T>       条件对象
//     * @return
//     */
//    private static <T> String analysis(String jsonStr, T condition) {
//        String value = null;
//        String key = null;
//        int j = 0;
//        /**   todo  0. json 校验  */
//        /**   1. 开始解析json字符串  */
//        Map<String, String> jsonMap = JSON.parseObject(jsonStr, new TypeReference<LinkedHashMap<String, String>>() {
//        });
//        System.out.println("我是第[{}]层:    "+ layer);
//        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
//            j++;
//            value = entry.getValue();
//            key = entry.getKey();
////            if(layer==condition.getLayer()&&condition.get????==key){     // 如果符合条件
//            System.out.println(key + ":" + value);
////            return null;
////            }
//        }
//        if (j == jsonMap.size()) {
//            layer++;
//            for (Map.Entry<String, String> entry : jsonMap.entrySet()) {    //找出下一层以 "{" or "[{" 的  key'value
//                value = entry.getValue();
//                if (value != null && value.startsWith("{")) {
//                    analysis(value, condition);
//                }
//                if (value != null && value.startsWith("[{")) {
//                    String[] values = value.substring(1, value.length() - 1).replace("},", "}===").split("===");
//                    for (String v : values) {
//                        analysis(v, condition);
//                    }
//                }
//            }
//        }
//        return null;
//    }
//}
//
