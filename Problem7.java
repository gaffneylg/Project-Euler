// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

import java.util.ArrayList;

public class Problem7 {
  public static void main(String[] args) {
    ArrayList<Long> primes = new ArrayList<>();
    primes.add(2L);
    long val = 3;
    do {
      boolean check = Problem3.checkPrime(val);
      if (check) {
        primes.add(val);
        val = val+2;
      }
      else {
        val = val+2;
      }
    } while (primes.size() < 10_001);

    System.out.println("The 10,001st prime is: " + primes.get(primes.size()-1));
  }
}
