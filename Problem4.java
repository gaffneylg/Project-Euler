//A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {
  public static void main(String[] args) {
    int largest = 0;

    largeLoop:
    for(int i=999;i>99;i--) {
      for(int j=i-1; j>99; j--) {
        int val = i * j;
        String number = Integer.toString(val);
        int midway = endIndex(number);
        String start = number.substring(0, midway);
        String end = number.substring(midway, number.length());
        StringBuilder sb = new StringBuilder(end);
        if (start.equals(sb.reverse().toString())) {
          if (val>largest) {
            largest = val;
          }
        }
      }
    }
    System.out.println("The largest value is: " + largest);
  }

  static int endIndex(String string) {
    if(string.length()%2==0) {
      return string.length()/2;
    }
    else {
      return (string.length()/2)-1;
    }
  }
}
