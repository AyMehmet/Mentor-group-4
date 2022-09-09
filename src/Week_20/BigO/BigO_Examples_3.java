package Week_20.BigO;

public class BigO_Examples_3 {
    public static void main(String[] args) {


    }

    // Calculate the sum of all number from 1 to number n//

  public static void printnumberNumber1(int n){
      for(int i=1; i<=Math.max(5,n); i++)//O(n)
          System.out.println(i);
  }

    public static void printnumberNumber2(int n){
        for(int i=1; i<=Math.min(10000000,n); i++) //O(1)
            System.out.println(i);
    }

    public static void printnumberNumber3(int n){
        System.out.println(n);//O(1)
        System.out.println(n);//O(1)
        System.out.println(n);//O(1)

    }
}
