package study_java;

import java.util.HashMap;
import java.util.Map;

public class map_0711 {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("testStr", "테스트 데이터 입니다.");

        map.put("testInt", 1234567890);

        System.out.println("문자열 데이터 표출 : " + map.get("testStr"));
        System.out.println("정수 데이터 표출 : " + map.get("testInt"));

        String setStr = map.get("testStr").toString();

        int setInt = (int)map.get("testInt");

        System.out.println(setInt + "  " + setStr);
    }
}
