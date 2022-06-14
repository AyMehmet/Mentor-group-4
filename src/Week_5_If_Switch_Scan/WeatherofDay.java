package Week_5_If_Switch_Scan;

public class WeatherofDay {

    public static void main(String[] args) {

        int temp=35;
        
        if (temp>30) {
            System.out.println("Hot day");
            System.out.println("Drink water ");
        } else if (temp>20 && temp<=30 )
            System.out.println("Good day");
        else System.out.println("Cold day");

    }
}
