//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.

import java.util.ArrayList;

public class Problem10 {
  public static void main(String[] args) {

    int max = 2_000_000;
    ArrayList<Long> primes = new ArrayList<>();
    primes.add(2L);
    for(long i=3L; i<max; i=i+2) {
      if(Problem3.checkPrime(i)) {
        primes.add(i);
      }
    }
    long sum = primes.stream().mapToLong(Long::longValue).sum();
    System.out.println("Sum of primes under 2 mil: " + sum);
  }
}
