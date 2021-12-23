package Lada303.lesson3;

import java.util.*;

public class Lesson3 {

    public static void main(String[] args) {
        // №1
        String[] arrayWords = new String[]{"Apple", "Banana", "Orange", "Mango", "Apple", "Apple", "Orange",
                "Apple", "Orange", "Apple", "Orange", "Plum", "Banana", "Banana", "Pear", "Plum"};
        countWords(arrayWords);

        // №2
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Ivanov", "+78888888881");
        telephoneDirectory.add("Ivanov", "+78888888881");
        telephoneDirectory.add("Ivanov", "+78888888882");
        telephoneDirectory.add("Ivanov", "+78888888883");
        telephoneDirectory.add("Petrov", "+78888888888");
        System.out.println(telephoneDirectory.get("Ivanov"));
        System.out.println(telephoneDirectory.get("Petrov"));


    }

    private static void countWords(String[] arrStr) {
        Map<String, Integer> mapWords = new HashMap<>();
        for (int i = 0; i < arrStr.length; i++) {
            Integer val = mapWords.getOrDefault(arrStr[i], 0);
            mapWords.put(arrStr[i], ++val);
        }
        System.out.println(mapWords);
    }

}
