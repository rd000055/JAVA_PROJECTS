// Write a java program to read the age of a candidate and determine whether he
// is eligible to cast his/her own vote.

package java_projects_1;// This line denotes the folder of the file where it is stored

public class voting {
 public static void main(String[] args) 
 {
    int age;
    age = 17;
    if(age>=18)
    {
        System.out.println("you are eligible to cast vote");
    }
    else
    {
    System.out.println("Sorry,you are not eligible to cast vote");
    }
 }
}
