package builder1;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthDay(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    // method to "assemble" final product
    UserDTO build();
    // optional builder1.UserDTO getter method
    UserDTO getUserDto();


}
