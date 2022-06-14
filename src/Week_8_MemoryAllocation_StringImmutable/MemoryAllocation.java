package Week_8_MemoryAllocation_StringImmutable;

public class MemoryAllocation {


    public static void main(String[] args) {
        int value=5;
        String str="Memo";
        String str1=str;
        str=str1.concat("Memo1");
        String str2=new String("Memo");
        str=str1;
        value =calculate(value);

//        Person p1=new Person();
//        p1.firstName="memo";

    }

    private static int calculate(int data) {
        int tempValue= data+5;
        int newValue=tempValue*2;
        return newValue;
    }
}
