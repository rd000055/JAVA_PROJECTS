// Implement the following procedure to generate prime numbers from 1 to 100 into a
// program. This procedure is called sieve of Eratosthenes.
// Step 1: Fill an array num [100] with numbers from 1 to 100
// Step 2: Starting with the second entry in the array, set all its multiples to zero.
// Step 3: Proceed to the next non-zero element and set all its multiples to zero.
// Step 4: Repeat step 3 till you have set up the multiples of all the non-zero elements to
// zero.
// Step 5: At the conclusion of step 4, all the non-zero entries left in the array would be
// prime numbers, so print out these numbers.

package java_projects_2;// importing files in java folder 

public class SieveOfEratosthenes_2 {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] primes = new boolean[limit + 1];

        // Step 1: Fill the array num[100] with numbers from 1 to 100
        for (int i = 0; i <= limit; i++) {
            primes[i] = true;
            System.out.println(primes[i]);
        }
        
        // Step 2: Starting with the second entry in the array, set all its multiples to zero.
        for (int num = 2; num * num <= limit; num++) {
            if (primes[num]) {
                for (int multiple = num * num; multiple <= limit; multiple += num) {
                    primes[multiple] = false;
                }
            }
        }

        // Step 5: Print out the prime numbers (non-zero entries) left in the array
        System.out.println("Prime numbers from 1 to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
