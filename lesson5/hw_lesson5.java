package lesson5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;


public class hw_lesson5 {

    public static void main(String[] args) {


        String text = "мороз и солнце, день чудесный. Еще ты дремлешь друг прелестный. Пора красавица, проснись.";
        text = text.replaceAll("[^A-Za-zА-Яа-я ]", "");
        String[] subStr;
        subStr = text.split(" ");

        Map<Integer, Collection<String>> collText = new TreeMap<>();
        for (int i = 0; i < subStr.length; i++) {
            ArrayList<String> lenText = new ArrayList<>();
            for (String s : subStr) {
                if (subStr[i].length() == s.length()) {
                    lenText.add(s);
                }
            }
            collText.put(subStr[i].length(), lenText);
        }
        for (Collection<String> s : collText.values()) {
            System.out.println(s);
        }
    }
}