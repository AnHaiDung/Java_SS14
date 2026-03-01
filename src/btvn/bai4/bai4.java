package btvn.bai4;

import java.util.*;

public class bai4 {
    public static void main(String[] args) {

        List<String> listSick = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");

        Map<String, Integer> statistical = new TreeMap<>();

        for (String sick : listSick) {
            if (statistical.containsKey(sick)) {
                int value = statistical.get(sick);
                statistical.put(sick, value + 1);
            } else {
                statistical.put(sick, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : statistical.entrySet()) {
            String sickName = entry.getKey();
            int numberCases = entry.getValue();
            System.out.println(sickName + ": " + numberCases + " ca");
        }
    }
}
