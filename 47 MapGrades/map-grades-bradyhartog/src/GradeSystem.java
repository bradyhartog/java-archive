import java.util.*;

/**
 * Maintains a map of students and their respective course grades.
 */
public class GradeSystem {
    Map<String, String> grades = new TreeMap<>();

    /**
     * Constructs a GradeSystem object.
     */
    public GradeSystem() {}

    /**
     * Adds a student to the map
     * @param student student's name
     * @param grade student's grade
     */
    public void addStudent(String student, String grade) {
        grades.put(student, grade);
    }

    /**
     * Removes a student from the map
     * @param student student's name
     */
    public void removeStudent(String student) {
        grades.remove(student);
    }

    /**
     * Modifies a student's grade in the map
     * @param student student's name
     * @param grade student's new grade
     */
    public void modifyGrade(String student, String grade) {
        grades.put(student, grade);
    }

    /**
     * Prints all student's names and grades in lexicographic order.
     * @return listed students and grades
     */
    public String printGrades() {
        String output = "";
        for(String key : grades.keySet()) {
            output = output + key + ": " + grades.get(key) + "\n";
        }
        return output;
    }
}