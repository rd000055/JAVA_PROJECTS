package java_projects_1;// This line denotes the folder of the file where it is stored

public class starpattern_3 {//class name should be created sames as file name
    public static void main(String[] args) {
        int rows = 4;

      
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  "); 
            }

            // Inner loop for stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*"); 
                if (k < i) {
                    System.out.print("  "); 
                }
            }

            System.out.println();
        }
    }
}



















// CREATED BY KERSTON2104 ON GITHUB