// 7. Write a program to input marks of five subjects Physics, Chemistry, Biology,
// Mathematics and Computer. Calculate percentage and grade according to
// following:
//  Percentage >= 90% : Grade A
//  Percentage >= 80% : Grade B
//  Percentage >= 70% : Grade C
//  Percentage >= 60% : Grade D
//  Percentage >= 40% : Grade E
//  Percentage < 40% : Grade F


package java_projects_1;// This line denotes the folder of the file where it is stored
import java.util.Scanner;

public class percentagecal_7{//class name should be created sames as file name
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the marks obtained in Physics: ");
        int physicsMarks = input.nextInt();

        System.out.print("Enter the marks obtained in Chemistry: ");
        int chemistryMarks = input.nextInt();

        System.out.print("Enter the marks obtained in Tamil: ");
        int biologyMarks = input.nextInt();

        System.out.print("Enter the marks obtained in Mathematics: ");
        int mathematicsMarks = input.nextInt();

        System.out.print("Enter the marks obtained in Computer: ");
        int computerMarks = input.nextInt();

        int totalMarks = physicsMarks + chemistryMarks + biologyMarks + mathematicsMarks + computerMarks;
        double percentage = (totalMarks / 500.0) * 100;

        String grade;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        input.close();
    }
}




