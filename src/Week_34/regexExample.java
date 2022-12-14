package Week_34;

public class regexExample {

    //public static final String REPLACE_ALL_REGEX = ").replaceAll(regex:";

    public static void main(String[] args) {

        String str = "asfljj AAAa... 4454545fsfsdfsg..***";


        String str1 = str.replaceAll("\\d", "@");
        String str2 = str.replaceAll("\\D", "@");
        String str3 = str.replaceAll("\\W", "@");
        String str4 = str.replaceAll("\\W+", "@");
        String str5 = str.replaceAll("\\w", "@");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
