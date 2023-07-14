package java_projects_1;

public class primenumber {

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
