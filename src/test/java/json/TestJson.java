package json;//package json;
//
//import java.util.Map;
//
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//
//public class TestJson {
//
//    public static void testToJson() {
//
//        JSONArray arr = new JSONArray();
//        JSONObject obj1 = new JSONObject();
//        obj1.put("code", "264000000000");
//        obj1.put("name", "IT设备");
//        arr.add(obj1);
//        JSONObject obj2 = new JSONObject();
//        obj2.put("code", "264000000010");
//        obj2.put("name", "数码通讯");
//        arr.add(obj2);
//        JSONObject obj3 = new JSONObject();
//        obj3.put("code", "264000000020");
//        obj3.put("name", "办公用品耗材");
//        arr.add(obj3);
//        JSONObject obj4 = new JSONObject();
//        obj4.put("code", "264000000030");
//        obj4.put("name", "大家电");
//        arr.add(obj4);
//        JSONObject obj5 = new JSONObject();
//        obj5.put("code", "264000000080");
//        obj5.put("name", "超市用品");
//        arr.add(obj5);
//        JSONObject obj6 = new JSONObject();
//        obj6.put("code", "264000000090");
//        obj6.put("name", "母婴");
//        arr.add(obj6);
//        JSONObject obj7 = new JSONObject();
//        obj7.put("code", "264000000040");
//        obj7.put("name", "政府采购");
//        arr.add(obj7);
//        JSONObject obj8 = new JSONObject();
//        obj8.put("code", "264000000050");
//        obj8.put("name", "礼品");
//        arr.add(obj8);
//        JSONObject obj9 = new JSONObject();
//        obj9.put("code", "264000000060");
//        obj9.put("name", "礼品卡");
//        arr.add(obj9);
//        JSONObject obj0 = new JSONObject();
//        obj0.put("code", "264000000070");
//        obj0.put("name", "其他");
//        arr.add(obj0);
//        // System.out.println(jbt.toJSONString());
//        System.out.println(arr.toString());
//    }
//
//    public static void testToJson2() {
//        JSONArray arr = new JSONArray();
//        JSONObject obj1 = new JSONObject();
//        obj1.put("code", "264000000080");
//        obj1.put("name", "大家电");
//        JSONObject obj2 = new JSONObject();
//        obj2.put("code", "264000000070");
//        obj2.put("name", "礼品卡");
//        arr.add(obj1);
//        arr.add(obj2);
//        System.out.println(arr.toJSONString());
//    }
//
//    public static void testToJson3() {
//        JSONObject obj1 = new JSONObject();
//        obj1.put("code", "264000000080");
//        obj1.put("name", "大家电");
//        System.out.println(obj1.toJSONString());
//    }
//
//    public  static void testString(String text) {
//    	JSONObject object=JSONObject.parseObject(text);
//    	System.out.println(object);
//    	System.out.println(object.get("name"));
//    }
//
//    public static void main(String[] args) {
////        testToJson3();
//    	 JSONArray arr = new JSONArray();
//        JSONObject obj1 = new JSONObject();
//        obj1.put("type", "t1");
//        obj1.put("name", "aaa");
//        JSONObject obj2 = new JSONObject();
//        obj2.put("type", "t2");
//        obj2.put("name", "bbb");
//        arr.add(obj1);
//        arr.add(obj2);
//        System.out.println(arr.toJSONString());
////        System.out.println("s1:"+obj1.toJSONString());
////        System.out.println("s2:"+obj1.toString());
////        testString(obj1.toJSONString());
////        testString("111");
//    }
//}
