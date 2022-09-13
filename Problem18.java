// By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
//
//   3
//  7 4
// 2 4 6
//8 5 9 3
//
//That is, 3 + 7 + 4 + 9 = 23.
//
//Find the maximum total from top to bottom of the triangle below:
//               75
//              95 64
//             17 47 82
//            18 35 87 10
//           20 04 82 47 65
//          19 01 23 75 03 34
//         88 02 77 73 07 63 67
//        99 65 04 28 06 16 70 92
//       41 41 26 56 83 40 80 70 33
//      41 48 72 33 47 32 37 16 94 29
//     53 71 44 65 25 43 91 52 97 51 14
//    70 11 33 28 77 73 17 78 39 68 17 57
//   91 71 52 38 17 14 91 43 58 50 27 29 48
//  63 66 04 68 89 53 67 30 73 16 69 87 40 31
// 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
import javafx.util.Pair;

public class Problem18 {

  public static void main(String[] args) {

    int row1[] = new int[] {75};
    int row2[] = new int[] {95,64};
    int row3[] = new int[] {17,47,82};
    int row4[] = new int[] {18,35,87,10};
    int row5[] = new int[] {20,4,82,47,65};
    int row6[] = new int[] {19,1,23,75,3,34};
    int row7[] = new int[] {88,2,77,73,7,63,67};
    int row8[] = new int[] {99,65,4,28,6,16,70,92};
    int row9[] = new int[] {41,41,26,56,83,40,80,70,33};
    int row10[] = new int[] {41,48,72,33,47,32,37,16,94,29};
    int row11[] = new int[] {53,71,44,65,25,43,91,52,97,51,14};
    int row12[] = new int[] {70,11,33,28,77,73,17,78,39,68,17,57};
    int row13[] = new int[] {91,71,52,38,17,14,91,43,58,50,27,29,48};
    int row14[] = new int[] {63,66,4,68,89,53,67,30,73,16,69,87,40,31};
    int row15[] = new int[] {4,62,98,27,23,9,70,98,73,93,38,53,60,4,23};

    Problem18 pro = new Problem18();
    int sum = 0;
    int index = 0;
    int[][] rows = {row1,row2,row3,row4,row5,row6,row7,row8,row9,row10,row11,row12,row13,row14,row15};

    for(int i=0;i<rows.length;i++) {
      int[] current = rows[i];
      Pair<Integer,Integer> res;
      if (i+1<rows.length) {
        int[] next = rows[i+1];
        res = pro.lookAhead(current, next, index);
      } else {
        res = pro.chooser(current, index);
      }
      sum += res.getValue();
      index = res.getKey();
    }

    System.out.println("Sum of highs from top to bottom: "+ sum);
  }

  private Pair<Integer, Integer> lookAhead(int[] row, int[] next, int index) {
    int left = row[index];
    int right = right(row, index);
    Pair<Integer,Integer> best;
    int aheadLeft = left + chooser(next, index).getValue();
    int aheadRight = right + chooser(next,(index+1)).getValue();
    if (aheadLeft > aheadRight) {
      best = new Pair<>(index, left);
    } else {
      best = new Pair<>(index+1, right);
    }
    return best;
  }


  private Pair<Integer, Integer> chooser(int[] row, int index) {
    Pair <Integer, Integer> highest;
    int left = row[index];
    int right = right(row, index);

    int max = Math.max(left, right);
    if (max == left) {
      highest = new Pair<>(index,left);
    }
    else {
      highest = new Pair<>(index+1,right);
    }
    return highest;
  }

  private int right(int[] row, int index) {
    if((index+2)>row.length) {
      return row[index];
    } else {
      return row[index+1];
    }
  }

}