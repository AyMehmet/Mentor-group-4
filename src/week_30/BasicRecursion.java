package week_30;

public class BasicRecursion {

    public static void main(String[] args) {

        System.out.println(sumNumber(3));

    }

    static int sumNumber(int num){
        if (num>0) return num+sumNumber(num-1);
        return num;
    }
}
