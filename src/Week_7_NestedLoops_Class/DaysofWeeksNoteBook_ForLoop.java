package Week_7_NestedLoops_Class;

public class DaysofWeeksNoteBook_ForLoop {

    public static void main(String[] args) {


        String weekPrefix = "Week: ";
        String dayPrefix = "   Day: ";

        //outer loop will iterate over weeks
        for (int weekCounter = 1; weekCounter < 5; weekCounter++) {
            System.out.println(weekPrefix + weekCounter);

            //inner loop will iterate over days of week
            // we need to start from 1 for each week
            //that's why we are assigning 1 to dayCounter for each week
            for (int dayCounter = 1; dayCounter < 8; dayCounter++) {
                System.out.println(dayPrefix + dayCounter);
            }
        }
    }
}