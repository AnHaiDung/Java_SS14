package re.edu.compare;

import java.lang.Comparable;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        /*
        trả về 1 nếu đối tượng this lớn hơn đối tượng o
        trả về 0 nếu đối tượng this giống đối tượng o
        trả về -1 nếu đối tượng thí nhỏ hơn đối tượng o
        */
//        Tiêu chí ss
//        theo tên
//        return this.name.compareTo(o.name);
//        Sắp xếp đa tiêu chí: sắp xếp theo điểm tăng dần, nếu điểm giống nhau thì sắp xếp theo id giảm dần
        if (this.score == o.score){
            return o.id -this.id;
        }
        return Double.compare(this.getScore(),o.getScore());
//        return Double.compare(this.score,o.score);
    }
}
