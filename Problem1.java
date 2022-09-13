// Find the sum of all the multiples of 3 or 5 below 1000.

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

  public static void main(String[] args) {
    int three = 3;
    int five = 5;
    int max = 1000;
    List<Integer> nums = new ArrayList<>();
    int sum;

    for(int i = 1; i < max; i++) {
      if(i%three==0) {
        nums.add(i);
      }
      else if(i%five==0) {
        nums.add(i);
      }
    }
    sum = nums.stream().mapToInt(Integer::intValue).sum();
    System.out.println("The sum is: " + sum);


  }
}
