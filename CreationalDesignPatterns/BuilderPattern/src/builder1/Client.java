package builder1;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder userDTOBuilder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(userDTOBuilder,user);
        System.out.println(dto);
    }

    // Director
    private static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user){
       return userDTOBuilder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthDay(user.getBirthday())
                .build();
    }

    /*
    Returns a sample user object
     */
    public static User createUser(){
        User user = new User();
        user.setBirthday(LocalDate.of(1998,8,21));
        user.setFirstName("Tolga");
        user.setLastName("Ocal");
        Address address = new Address();
        address.setCity("Istanbul");
        address.setHouseNumber("1");
        address.setStreet("Sarkicilar Sokak");
        address.setZipcode("34300");
        address.setState("TURKEY");
        user.setAddress(address);
        return user;
    }


}
