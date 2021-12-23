package Lada303.lesson3;

import java.util.*;

public class TelephoneDirectory {


    private final Map<String, Set<String>> telephoneDirectory = new HashMap<>();


    public Set<String> get (String surname) {
        return telephoneDirectory.get(surname);
    }


    public void add(String surname, String telephoneNumber) {
        Set<String> telephoneSet = telephoneDirectory.putIfAbsent(surname,
            new HashSet<>(List.of(telephoneNumber)));
        if (telephoneSet == null) {
            return;
        }
        telephoneSet.add(telephoneNumber);
        telephoneDirectory.put(surname, telephoneSet);
    }

}
