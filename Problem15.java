//Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

//How many such routes are there through a 20×20 grid?


public class Problem15   {
  public static void main(String[] args) {
    long size = 10;
    Problem15 pro = new Problem15();
    long sizeFac = pro.fac(size);
    long combos = pro.fac((2*size))/(sizeFac*sizeFac);

    System.out.println("Number of combos: "+ combos);

  }

  private long fac(long size) {
    long res = 1;
    for(long i=1; i<=size; i++) {
      res = res*i;
    }
    return res;
  }

}
