package builder1;

public class UserWebDTO implements UserDTO{

    private final String name;
    private final String address;
    private final String age;

    public UserWebDTO(String name, String address, String age){
        this.address = address;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }

}
