package btvn.bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatientManager {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Lan", 45, "Tim mạch"));
        patients.add(new Patient("Hùng", 62, "Nội tiết"));
        patients.add(new Patient("Mai", 38, "Tim mạch"));

        Map<String, List<Patient>> groupByDepartment = new HashMap<>();

        for (Patient p : patients) {
            String department = p.getDepartment();
            if (!groupByDepartment.containsKey(department)) {
                groupByDepartment.put(department, new ArrayList<>());
            }
            groupByDepartment.get(department).add(p);
        }

        for (Map.Entry<String, List<Patient>> entry : groupByDepartment.entrySet()) {
            String department = entry.getKey();
            List<Patient> list = entry.getValue();

            System.out.println(department );
            for (Patient patient : list) {
                System.out.println(patient);
            }
            System.out.println();
        }

        String maxDepartment = null;
        int maxPatient = -1;

        for (Map.Entry<String, List<Patient>> entry : groupByDepartment.entrySet()) {
            int soLuong = entry.getValue().size();
            if (soLuong >maxPatient) {
                maxPatient = soLuong;
                maxDepartment = entry.getKey();
            }
        }

        if (maxDepartment != null) {
            System.out.println("Khoa"+ maxDepartment + "đang đông nhất: " + " (" + maxPatient + " bệnh nhân)");
        } else {
            System.out.println("Không có bệnh nhân nào.");
        }
    }
}
