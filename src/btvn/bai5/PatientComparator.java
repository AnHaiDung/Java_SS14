package btvn.bai5;

import java.util.Comparator;
import java.util.Scanner;

public class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        if (p1.getSeverity() != p2.getSeverity()) {
            return Integer.compare(p1.getSeverity(), p2.getSeverity());
        }
        return p1.getArrivalTime().compareTo(p2.getArrivalTime());
    }
}
