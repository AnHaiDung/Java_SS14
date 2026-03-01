package re.edu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Map lưu cặp key, value (key - khóa là 1 SET<key> tức là key không được trùng), giống Class
//        Tương tự Set
//        4 Lớp triển khai
//        HashMap
//        LinkedHashMap
//        TreeMap
//        EnumMap
        Map<String,String> dictionary = new HashMap<>();
//        Cac phuong thức lam việc
        dictionary.put("apple","táo");
        dictionary.put("apple","bưởi");
        dictionary.remove("apple");
        dictionary.get("apple");
        String value = dictionary.get("apple");
        dictionary.containsKey("apple");
        dictionary.containsValue("táo");
//        duyệt collection
//        3 cách duyệt
//        1. Theo key
        for (String key: dictionary.keySet()){
//            làm việc với key
        }
//        2. Theo value
        for (String values:  dictionary.values()){
//            làm việc với value
//            Không thể làm việc với key
        }
//        3. vừa key vừa value
        for (Map.Entry<String,String> entry: dictionary.entrySet()){
//            làm việc
            String key = entry.getKey();
            String values = entry.getValue();
        }
    }
}
