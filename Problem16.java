// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
// What is the sum of the digits of the number 2^1000?

import java.math.BigInteger;

public class Problem16 {

  public static void main(String args[]) {

    BigInteger val = BigInteger.valueOf(2);
    String valString = val.pow(1000).toString();
    int sum = 0;

    for(int i=0; i<valString.length(); i++) {
      Character c = valString.charAt(i);
      String s = c.toString();
      int m = Integer.valueOf(s);
      sum += m;

    }
    System.out.println("Result: " + sum);

  }

}
