import java.util.Scanner;

public class GradeTester {
    public static void main(String[] args) {
        GradeSystem grades = new GradeSystem();

        System.out.println("Welcome to GradeSys v1.0.");

        boolean done = false;
        Scanner in = new Scanner(System.in);
        while(!done) {
            System.out.println();
            System.out.println("Select an action:");
            System.out.println("1) Add student/grade");
            System.out.println("2) Remove student");
            System.out.println("3) Modify grade");
            System.out.println("4) Print grades");
            System.out.println("5) Quit");
            int inputSelect = in.nextInt();
            if(inputSelect == 1) {
                System.out.println();
                System.out.print("Student name: ");
                String studentName = in.next();
                System.out.print("Student grade: ");
                String studentGrade = in.next();
                grades.addStudent(studentName, studentGrade);
            } else if(inputSelect == 2) {
                System.out.println();
                System.out.print("Student name: ");
                String studentName = in.next();
                grades.removeStudent(studentName);
            } else if(inputSelect == 3) {
                System.out.println();
                System.out.print("Student name: ");
                String studentName = in.next();
                System.out.print("New grade: ");
                String studentGrade = in.next();
                grades.modifyGrade(studentName, studentGrade);
            } else if(inputSelect == 4) {
                System.out.println();
                System.out.print(grades.printGrades());
            } else if(inputSelect == 5) {
                System.out.println();
                System.out.println("Thank you for using GradeSys!");
                done = true;
            } else {
                System.out.println();
                System.out.println("Please try again. Goodbye!");
                done = true;
            }
        }
    }
}