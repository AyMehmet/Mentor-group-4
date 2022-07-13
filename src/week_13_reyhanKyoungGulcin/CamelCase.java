package week_13_reyhanKyoungGulcin;

public class CamelCase {

    public static void main(String[] args) {

        String camelCase = "weLoveProgramming";

        System.out.println(breakCamelCase(camelCase));

    }

    public static String breakCamelCase(String camelCase) {
        String result = "";

        for (char each : camelCase.toCharArray()) {
            if (Character.isUpperCase(each)) {
                result += " " + each;
            } else {
                result += each;
            }
        }
        return result;
    }
}
