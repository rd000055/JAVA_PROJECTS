// Write a program to input basic salary of an employee and calculate its Gross
// salary according to following:
//  Basic Salary <= 10000 : HRA = 20%, DA = 80%
//  Basic Salary <= 20000 : HRA = 25%, DA = 90%
//  Basic Salary > 20000 : HRA = 30%, DA = 95%

package java_projects_1;

import java.util.Scanner;

public class grossalary_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double grossSalary = calculateGrossSalary(basicSalary);
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }

    public static double calculateGrossSalary(double basicSalary) {
        double hra, da;

        if (basicSalary <= 10000) {
            hra = 0.2 * basicSalary;
            da = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.3 * basicSalary;
            da = 0.95 * basicSalary;
        }

        return basicSalary + hra + da;
    }
}
