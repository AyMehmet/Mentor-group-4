package Week_5_If_Switch_Scan;

public class IncomeCheck {

    public static void main(String[] args) {
        int income=50000;
        String status;
        //Scanner reader=new Scanner(System.in);
        //System.out.println("Please put your  income :");
        //income=reader.nextInt();
        status= (income>100_000)?"rich":"poor";

        System.out.println("Status :" + status);
    }
}
