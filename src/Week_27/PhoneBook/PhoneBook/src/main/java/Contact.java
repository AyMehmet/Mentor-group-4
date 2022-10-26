import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 In this practice, we did avoid to use of private fields not to confuse.
 You can convert this implementation to the encapsulated way with your own.
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Contact {

    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
}
