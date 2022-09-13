// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a^2 + b^2 = c^2
//For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class Problem9 {
  public static void main(String[] args) {
    int product = 1000;

    for(int i=1; i<product/2; i++) {
      for(int j=i+1; j<product/2; j++) {
        int a = i*i;
        int b = j*j;
        int c = a+b;
        double pyth = (Math.sqrt(c));
        if(pyth%1==0) {
          int k = (int) Math.round(pyth);
          if (i+j+k==1000) {
            System.out.println("a: " + i + ", b: " + j + ", c: " + Math.sqrt(c));
            System.out.println("Product is: " + (i*j*k));
          }
        }
      }
    }
  }
}
