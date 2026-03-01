package re.edu.compare;

import java.util.Comparator;
import java.util.Scanner;

public class StudentComperator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getScore(),o2.getScore());
    }

}
