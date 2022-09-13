//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

public class Problem3 {
  public static void main(String[] args) {

    long val = 600_851_475_143L;
    long highestPossible = (val / 2) -1;

    long highest = 1L;

    for (long i = 1L; i < highestPossible; i = i + 2) {
      if (val % i == 0) {
        if (checkPrime(i)) {
          highest = i;
        } else {
          continue;
        }
      } else {
        continue;
      }
    }
    System.out.println("The highest prime factor is: " + highest);
  }

    public static boolean checkPrime(long num) {
      boolean prime = true;
      for(long i = 3L; i<num/2; i=i+1) {
        if(num%i==0){
          prime = false;
          break;
        }
      }
      return prime;

    }




}