package Week_7_NestedLoops_Class;

public class Person {

    String name;
    String lastName;
    int age;
    char gender;
    String location;

    public void live(String name, String location){

        System.out.println(name + " is living in " + location);
    }
    public void say(){
        this.live(this.name,this.location);
    }

}
