package re.edu.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
//    Lưu : để sắp xếp thì các phần tử phải so sánh được
    public static void main(String[] args) {
//        "Hôn Loàn".compareTo("Bò sữa");
//        2 interface: Comparable vs Comparator
        List<String> names = Arrays.asList("Trang","Sơn","Ánh");
        System.out.println(names);
        System.out.println("Sau khi sắp xếp: \n");
        Collections.sort(names);
        System.out.println(names);
    }
}
