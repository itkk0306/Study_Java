package study_java;

import java.util.HashMap;
import java.util.Map;

public class map_0711 {
    public static void main(String[] args) {

        //map(key: value> value의 자료형이 Object라 모든 Object는 다 들어갈 수 있다.
        Map<String, Object> map = new HashMap<String, Object>();

        //Map에 문자열 데이터를 넣는다.
        map.put("testStr", "테스트 데이터 입니다.");

        //Map에 정수 데이터를 넣는다.
        map.put("testInt", 1234567890);

        //13,16번 라인에서 저장할때 쓴 Key를 사용하여 Value를 불러옵니다.
        System.out.println("문자열 데이터 표출 : " + map.get("testStr"));
        System.out.println("정수 데이터 표출 : " + map.get("testInt"));

        //map에 저장된 Value의 자료형을 불러 옵니다. Type : String
        System.out.println("자료형:: " + map.get("testStr").getClass().getName());
        System.out.println("자료형:: " + map.get("testInt").getClass().getName());

        //map 데이터를 문자열, 정수형에 세팅
        String setStr = map.get("testStr").toString();
        int setInt = (int)map.get("testInt");

        System.out.println(setInt + "  " + setStr);

        //근데 왜 명시적으로 타입을 지정해줘야하나
        Map<String,String> testMap = new HashMap<String, String>();
        /* HashMap은 Map을 구현한다. Key와 value를 묶어 하나의 entry로 저장한다는 특징을 갖는다.
           그리고 hashing을 사용하기 때문에 많은 양의 데이터를 검색하는데 뛰어난 성능을 보인다.
           Map 인터페이스의 한 종류로 ("Key", value)로 이루어져 있다.
           Key 값은 중복이 불가능하고 value는 중복이 가능.
           value에 null값고 사용 가능하다.
           멀티 쓰레드에서 동시에 HashMap을 건드려 Key-value값을 사용하면 문제가 될 수 있다.
           멀티 쓰레드에서는 HashTable을 쓴다.
         */

        //testMap에 String 값의 키값을 넣어주고, String 값의 값을 넣어 준다.
        testMap.put("1번 강아지 이름", "금강");
        testMap.put("2번 강아지 이름", "여포");
        testMap.put("3번 강아지 이름", "단무지");

        //get 메소드를 이용해 값을 출력하기기
       for(int i = 1; i <= testMap.size(); i++){
            System.out.println(testMap.get(i+ "번 강아지 이름"));
        }

    }
}
