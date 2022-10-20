package Week_26.PassByValue;

public class PrimitiveTest {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("original num : " + num);
        add(num);
        System.out.println("after addition : " + num);
    }

    static void add(int n){
        n = n + 5;
    }
}
