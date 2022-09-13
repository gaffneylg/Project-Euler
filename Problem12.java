//The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
//
//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//
//Let us list the factors of the first seven triangle numbers:
//
// 1: 1
// 3: 1,3
// 6: 1,2,3,6
//10: 1,2,5,10
//15: 1,3,5,15
//21: 1,3,7,21
//28: 1,2,4,7,14,28
//We can see that 28 is the first triangle number to have over five divisors.
//
//What is the value of the first triangle number to have over five hundred divisors?

public class Problem12 {
  public static void main(String[] args) {
    int targetDivisors = 500;
    boolean numOfDivisors;
    int triNum = 0;
    boolean target = false;

    int i=0;
    do {
      i++;
      triNum = triNum + i;
      numOfDivisors = divisorFinder(triNum, targetDivisors);
      if (numOfDivisors) {
        System.out.println("The first triangle number with over "+ targetDivisors + " divisors is: " + triNum);
        target = true;
      }
    } while (!target);

  }

  private static boolean divisorFinder(int triNum, int target) {
    int total = 0;
    for(int i=1; i<=triNum; i++) {
      if(triNum%i==0) {
        total++;
      }
    }
    return(total > target);
  }

}