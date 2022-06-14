package Week_7_NestedLoops_Class;

public class FirstNonRepeatingVowels {
    public static void main(String[] args) {

        System.out.println(getFirstNonRepeatingVowel("gggggg"));
    }


    public static int getFirstNonRepeatingVowel(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int vowelCount = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (ch == input.charAt(j)) {
                        vowelCount++;
                    }
                }
                if (vowelCount == 1)
                    return i;
            }
        }
        return -1;
    }

}
