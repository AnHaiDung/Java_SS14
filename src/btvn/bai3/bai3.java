package btvn.bai3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bai3 {
    public static void main(String[] args) {
        Set<String> ingredient = new HashSet<>();
        ingredient.add("Aspirin");
        ingredient.add("Caffeine");
        ingredient.add("Paracetamol");
        Set<String> allergens = new HashSet<>();
        allergens.add("Penicillin");
        allergens.add("Aspirin");

        Set<String> allergyWarning = new HashSet<>(ingredient);
        allergyWarning.retainAll(allergens);

        if (allergyWarning.isEmpty()) {
            System.out.println("Thuốc an toàn.");
        } else {
            System.out.println("Cảnh báo dị ứng: " + allergyWarning);
        }

        Set<String> thanhPhanAnToan = new HashSet<>(ingredient);
        thanhPhanAnToan.removeAll(allergens);

        System.out.println("Thành phần an toàn: " + thanhPhanAnToan);
    }
}
