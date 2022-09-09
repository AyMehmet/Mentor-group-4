package Week_20.BigO;

public class BigO_Examples_2 {

    public static void main(String[] args) {

        System.out.println(sumofNumber2(100000000));
    }

    // Calculate the sum of all number from 1 to number n//

    //O(1)
  public static double sumofNumber2(int n){

        return n*(n+1)/2;//constant
  }
}
