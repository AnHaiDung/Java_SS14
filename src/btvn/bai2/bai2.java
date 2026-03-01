package btvn.bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("T01", "Paracetamol");
        dictionary.put("T02", "Ibuprofen");
        dictionary.put("T03", "Amoxicillin");
        dictionary.put("T04", "Omeprazole");
        dictionary.put("T05", "Metformin");

        System.out.print("Nhập mã thuốc : ");
        String id = input.nextLine().trim().toUpperCase();

        String name = dictionary.get(id);

        if (name != null) {
            System.out.println("Tên thuốc: " + name);
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT.");
        }
    }
}
