// Write a java program to read the age of a candidate and determine whether he
// is eligible to cast his/her own vote.

package java_projects_1;// This line denotes the folder of the file where it is stored

import java.util.Scanner;//Import the required scanner to get input from the user.

public class voting_1{
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age=");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible to cast your vote.");
        }
        else
        {
            System.out.println("You are not eligible to cast your vote.");
        }
    }
}
            























// CREATED BY KERSTON2104 ON GITHUB