package study_java;

import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.util.ArrayList;
import java.util.List;

public class list_0711 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("사과");
        list.add("수박");
        list.add("딸기");

        list.add(2, "바나나");

        System.out.println(list);

        List<Integer> score = new ArrayList<Integer>();

    }
}
