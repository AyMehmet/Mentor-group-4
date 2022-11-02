package Week_28;

public class LengthofLastWord_Reyhan {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWorldOptimised("hello     world   word"));

    }
    public static int lengthOfLastWorldOptimised(String str) {

        boolean rightTrim = false;
        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == ' ' && !rightTrim) {
                continue;

            } else if (!rightTrim || str.charAt(i) != ' ') {

                rightTrim = true;
                count++;

            } else if (str.charAt(i) == ' ') {

                return count;
            }
        }

        return count;
    }
}
