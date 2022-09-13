//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {
  public static void main(String[] args) {
    int smallest = 0;
    boolean divisible = false;
    int val = 2520;

    do {
      if (divisible(val)) {
       smallest = val;
       divisible = true;
       val++;
      }
      else {
        val++;
      }
    } while (divisible == false);

    System.out.println("Smallest value is: " + smallest);
  }

  private static boolean divisible(int value) {
    boolean div = true;
    for(int i=3; i<21; i++){
      if(value%i==0) {
        continue;
      }
      else {
        div = false;
      }
    }
    return div;
  }

}
