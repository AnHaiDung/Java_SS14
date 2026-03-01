package re.edu.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set ke thừa collection
//        Set không lưu trữ phần từ trùng lặp
//        4 lớp triển khai :
//        HashSet ( Không xác định thứ tự lưu trữ )
//        LinkedHashSet ( Xác định vị trí chèn )
//        TreeSet ( cây nhị phân, được sắp xếp )
//        EnumSet ( Nhẹ và nhanh chỉ khi tìm kiếm )
//        Set<Integer> set1 = new TreeSet<>(Comparator.reverseOrder());
        Set<Sex> set = EnumSet.of(Sex.Male,Sex.Female,Sex.Other);
        System.out.println(set);
//        Các phương thức làm việc
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(1);// không được lưu
        System.out.println(set1);
//        duyệt set
        for (Integer value: set1){

        }
//        duyệt bằng iterator
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()){
//            Làm việc với phần tử
            Integer value = iterator.next();
        }
    }
}
