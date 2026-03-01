package btvn.bai5;

import java.util.Scanner;

public class Patient {
    private String name;
    private int severity;
    private String arrivalTime;

    public Patient(String name, int severity, String arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        String level;

        switch (severity) {
            case 1:
                level = "Nguy kịch";
                break;
            case 2:
                level = "Nặng";
                break;
            case 3:
                level = "Nhẹ";
                break;
            default:
                level = "Không xác định";
                break;
        }
        return name + " (Mức " + severity + " - " + level + ", đến " + arrivalTime + ")";
    }
}
