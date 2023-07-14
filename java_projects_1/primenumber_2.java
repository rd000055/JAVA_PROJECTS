package java_projects_1;// This line denotes the folder of the file where it is stored

public class primenumber_2 {//class name should be created sames as file name

  public static boolean isPrime(int number) {
    if(number == 2) return true;
    else if(number<=1 || number%2==0)
         return false;

    for(int i=3; i<=Math.sqrt(number); i++){
         if(number%i == 0) return false;
    }

    return true;
  }

  public static void main(String[] args) {

    System.out.println("The First 10 prime numbers in Java are::");

    int i=1, count=0;
    while(count<10) {
       if(isPrime(i)) {
          System.out.print( i + " ");
          count++;
       }
       i++;
    }
  }
}


















// CREATED BY KERSTON2104 ON GITHUB
