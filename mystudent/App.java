package mystudent;
import java.util.Scanner;

public class App {
    public static void main(String [] args) {

        Student myStudent = new Student();
        myStudent.firstName = "Cooper";
        myStudent.lastName = "Howard";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();
        myStudent.firstName = "Pam";
        myStudent.lastName = "Beasley";
        myStudent.major = "Art";
        myStudent.gpa = 2.5;
        myStudent.age = 23;
        myStudent.onProbation = true;



        System.out.println(myStudent.firstName);
        System.out.println(myStudent2.firstName);
    }
}
