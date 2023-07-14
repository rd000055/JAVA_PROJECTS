package java_projects_1;// This line denotes the folder of the file where it is stored

public class starpattern_3 {//class name should be created sames as file name
    public static void main(String[] args) {
        int rows = 4; 
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



















// CREATED BY KERSTON2104 ON GITHUB