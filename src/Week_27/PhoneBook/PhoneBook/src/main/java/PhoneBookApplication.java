import com.github.javafaker.Faker;

import java.util.List;

public class PhoneBookApplication {
    public static void main(String[] args) {
        PhoneBookSinglyLinkedList phoneBook = new PhoneBookSinglyLinkedList();

        phoneBook.add(generateContactWithSameLastName());
        phoneBook.add(generateContactWithSameLastName());
        phoneBook.add(new Contact("Larry", "Bird",
                "bird@nba.com", "(866) 952-0828"));
        phoneBook.add(generateContactWithSameFirstName());
        phoneBook.add(generateContactWithSameLastName());
        phoneBook.add(generateContactWithSameLastName());

        phoneBook.add(generateContact());
        phoneBook.add(generateContactWithSameFirstName());
        phoneBook.add(new Contact("Scottie", "Pippen",
                "pippen@gmail.com", "(342) 456-1287"));
        phoneBook.add(generateContactWithSameLastName());
        phoneBook.add(generateContactWithSameLastName());


        System.out.println("*****Print all records*****");
        phoneBook.printPhoneBook();

        System.out.println("*****Find the first record of which first name is Scottie*****");
        System.out.println(phoneBook.findByFirstName("Scottie").contact);

        System.out.println("*****Find the all records of which last name is Jordan*****");
        phoneBook.findAllByLastName("Jordan").forEach(node -> System.out.println(node.contact));

        System.out.println("*****Delete the first occurrence of which first name is Michael*****");
        phoneBook.deleteByFirstName("Michael");
        phoneBook.printPhoneBook();

        System.out.println("*****Delete the all records of which last name is Jordan*****");
        phoneBook.deleteAllMatchingLastName("Jordan");
        phoneBook.printPhoneBook();

        System.out.println("*****Show the all records in ArrayList*****");
        List<PhoneBookNode> allPhoneRecords = phoneBook.findAll();
        allPhoneRecords.forEach(node -> System.out.println(node.contact));

        System.out.println("*****Show the last size of linkedList*****");
        System.out.println(phoneBook.size());


    }

    public static Contact generateContact() {
        Faker faker = new Faker();
        return new Contact(faker.name().firstName(), faker.name().lastName(),
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber());
    }

    public static Contact generateContactWithSameFirstName() {
        Faker faker = new Faker();
        return new Contact("Michael", faker.name().lastName(),
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber());
    }

    public static Contact generateContactWithSameLastName() {
        Faker faker = new Faker();
        return new Contact(faker.name().firstName(), "Jordan",
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber());
    }
}
