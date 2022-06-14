package Week_7_NestedLoops_Class;

    public class A {

        A getA(){
            return this;
        }
        void msg(){
            System.out.println("Hello java");}
    }

    class Test1 {
        public static void main(String args[]) {

            new A().msg();
            A a = new A();
            a.getA().msg();

        }
    }