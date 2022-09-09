package Week_20.BigO;

public class BigO_Examples_1 {
    public static void main(String[] args) {

        System.out.println(sumofNumber1(100000000));
    }

    // Calculate the sum of all number from 1 to number n//

    //O(n)-/O(1)

  public static double sumofNumber1(int n){
      double total =0;
      for(int i=1; i<=n; i++)
          total+=i;
      return total;
  }
}
