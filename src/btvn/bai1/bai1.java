package btvn.bai1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class bai1 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        String[] inputs = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };

        for (String name : inputs) {
            set.add(name);
        }

        System.out.println("Danh sách gọi khám :");
        for (String value : set) {
            System.out.println(value);
        }
    }
}
