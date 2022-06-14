package Week_5_If_Switch_Scan;

import java.util.Scanner;

public class DayofWeek {

    public static void main(String[] args) {

        /*  1. Read the user input int number which is day of week from console.
            2. Depends on the number print the corresponding day of week.
            3. If the user input is different then corresponding day of week print " Unvalid input "

         */


        System.out.println("Please input number  : ");
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();

        switch(num){

            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Number");
                break;
        }

        if (num==1)System.out.println("Monday");
        else if (num==2) System.out.println("Tuesday");
        else if (num==3) System.out.println("Wednesday");
        else if (num==4) System.out.println("Thursday");
        else if (num==5) System.out.println("Friday");
        else if (num==6) System.out.println("Saturday");
        else if (num==7) System.out.println("Sunday");
        else System.out.println("Invalid Number");
    }
}

