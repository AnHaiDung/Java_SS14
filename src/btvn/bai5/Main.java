package btvn.bai5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Patient> queue = new TreeSet<>(new PatientComparator());
        queue.add(new Patient("Bệnh nhân A", 3, "08:00"));
        queue.add(new Patient("Bệnh nhân B", 1, "08:15"));
        queue.add(new Patient("Bệnh nhân C", 1, "08:05"));

        for (Patient p : queue) {
            System.out.printf("%s%n", p);
        }
    }
}
