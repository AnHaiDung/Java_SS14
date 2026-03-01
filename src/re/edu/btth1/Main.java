package re.edu.btth1;

import java.util.*;

//Tạo list ngẫu nhiên 100 số từ 0 - 1000;
//1.1: Loại các phần tử trùng nhau trong danh sách
//1.2: Đếm số lần xuất hiện của các phần tử
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rad = new Random();
        for (int i = 0; i<100;i++){
            list.add(rad.nextInt(1000));
        }
        System.out.println(list);
        Set<Integer> newList = new HashSet<>(list);
        System.out.println(newList);

        Map<Integer, Integer> Map = new HashMap<>();

        for (Integer num : list) {
            if (Map.containsKey(num)) {
                Map.put(num, Map.get(num) + 1);
            } else {
                Map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: Map.entrySet()){
            System.out.printf("Số %d xuất hiện %d lần\n",entry.getKey(),entry.getValue());
        }





    }
}
