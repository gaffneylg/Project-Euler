//The following iterative sequence is defined for the set of positive integers:
//
//n → n/2 (n is even)
//n → 3n + 1 (n is odd)
//
//Using the rule above and starting with 13, we generate the following sequence:
//
//13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//Which starting number, under one million, produces the longest chain?
//
//NOTE: Once the chain starts the terms are allowed to go above one million.

public class Problem14 {
  public static void main(String[] args) {
    int number = 0;
    int max = 1_000_000;
    int longest = 0;

    for (int i = 1; i < max; i++) {
      int len = chainChecker(i);

      if (len > longest) {
        number = i;
        longest = len;
      }
    }
    System.out.println("Number of terms: " + longest + " \nStarting number: " + number);
  }

  private static int chainChecker(int i) {
    int chain = 1;
    long num = i;

    do {
      if (num % 2 == 0) {
        chain += 1;
        num = num / 2;
      } else {
        chain += 1;
        num = (num * 3) + 1;
      }
    } while (num != 1 && num > 0);

    return chain;
  }

}