// If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
// The use of "and" when writing out numbers is in compliance with British usage.


public class Problem17 {

  public static void main(String args[]) {

    Problem17 pro = new Problem17();
//    String[] zero = {"zero"};
//    String[] three = {"one", "two", "six", "ten", "and"};
//    String[] four = {"four", "five", "nine"};
//    String[] five = {"three", "seven", "eight", "forty", "fifty", "sixty"};
//    String[] six = {"eleven", "twelve", "twenty", "thirty", "eighty", "ninety"};
//    String[] seven = {"fifteen", "sixteen", "seventy", "hundred"};
//    String[] eight = {"thirteen", "fourteen", "eighteen", "nineteen", "thousand"};
//    String[] nine = {"seventeen"};

    int max = 1000;
    long used = 0;

    for(int j=1; j<=max; j++) {
      int[] vals = pro.handle(j);
      if (j < 10) {
        used += pro.convertNum(j);
      } else if (j > 9 && j < 20) {
        used += pro.convertTeens(j);
      } else if (j > 19 && j <= 99) {
        used += (pro.convertNum(vals[0]) + pro.convertTens(vals[1]));
      } else if (j % 100 == 0 && j != 1000) {
        used += (pro.convertNum(vals[2]) + 7);
      } else if (j > 100 && vals[1] == 1) {
        used += (pro.convertNum(vals[2]) + pro.convertTeens(j % 100) + 10);
      } else if (j > 100 && j < 1000) {
        used += (pro.convertNum(vals[0]) + pro.convertTens(vals[1]) + pro.convertNum(vals[2]) + 10);
      } else if (j == 1000) {
        used += 11;
      }
    }

    System.out.println("Number of letters used: " + used);
  }

  private int[] handle(Integer value) {
    String val = Integer.toString(value);
    int len = val.length();
    int[] vals = new int[len];
    String reverse = "";

    for (int i=len-1; i>=0; i--) {
      reverse = reverse + val.charAt(i);
    }

    for (int i=0; i<len; i++) {
      int num = Integer.parseInt(Character.toString(reverse.charAt(i)));
      vals[i] = num;
    }
    return vals;
  }

  private int convertNum(Integer digit) {
    int letters = 0;
    switch (digit) {
      case 0:
        break;
      case 1:
      case 2:
      case 6:
        letters = 3;
        break;
      case 3:
      case 7:
      case 8:
        letters = 5;
        break;
      case 4:
      case 5:
      case 9:
        letters = 4;
        break;
    }
    return letters;
  }

  private int convertTeens(Integer digit) {
    int letters = 0;
    switch (digit) {
      case 10:
        letters = 3;
        break;
      case 11:
      case 12:
        letters = 6;
        break;
      case 13:
      case 14:
      case 18:
      case 19:
        letters = 8;
        break;
      case 15:
      case 16:
        letters = 7;
        break;
      case 17:
        letters = 9;
        break;
    }
    return letters;
  }

  private int convertTens(Integer digit) {
    int letters = 0;
    switch (digit) {
      case 0:
        break;
      case 2:
      case 3:
      case 8:
      case 9:
        letters = 6;
        break;
      case 4:
      case 5:
      case 6:
        letters = 5;
        break;
      case 7:
        letters = 7;
        break;
    }
    return letters;
  }

//    private String convertTens(Integer digit) {
//      String digitString = "";
//      int position = pos;
//      switch (digit) {
//        case 0: digitString = "zero";
//          break;
//        case 1:  digitString = "one";
//          break;
//        case 2:  digitString = "two";
//          break;
//        case 3:  digitString = "three";
//          break;
//        case 4:  digitString = "four";
//          break;
//        case 5:  digitString = "five";
//          break;
//        case 6:  digitString = "six";
//          break;
//        case 7:  digitString = "seven";
//          break;
//        case 8:  digitString = "eight";
//          break;
//        case 9:  digitString = "nine";
//          break;
//      }
}

