/**
 * In this practice, we did avoid to use of private fields not to confuse.
 * You can convert this implementation to the encapsulated way with your own.
 */
public class PhoneBookNode {

    public PhoneBookNode next;

    public Contact contact;

    public PhoneBookNode(Contact contact) {
        this.contact = contact;
    }
}
