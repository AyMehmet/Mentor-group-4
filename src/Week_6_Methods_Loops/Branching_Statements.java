package Week_6_Methods_Loops;

public class Branching_Statements {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("********************************");

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("********************************");

        metthod();
//
//        for (int i = 0; i < 5; i++) {
//            if (i == 2){
//                return;
//            }
//            System.out.println(i);
//
//        }

        System.out.println("Last Line of Code");

    }

    public  static void metthod(){
        for (int i=0; i<5 ; i++) {
            if (i == 2) return;
            System.out.println(i);
        }
    }
}
