package Week_7_NestedLoops_Class;

public class DaysofWeeksNoteBook_WhileLoop {

    public static void main(String[] args) {

        String weekPrefix = "Week: ";
        String dayPrefix = "   Day: ";

        int weekCounter = 1;
        while (weekCounter <= 4) {
            System.out.println(weekPrefix + weekCounter);
            int dayCounter = 1;
            do {
                System.out.println(dayPrefix + dayCounter);
                dayCounter++;
            } while (dayCounter <= 7);

            dayCounter = 1;
            weekCounter++;
        }

    }
}