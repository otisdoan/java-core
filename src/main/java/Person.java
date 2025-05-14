import java.util.List;

public class Person {

    private String id;
    private String name;
    private String age;
    private List<Address> address;

    public Person() {
    }

    public Person(String id, String age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Person(String id, List<Address> address, String age, String name) {
        this.id = id;
        this.address = address;
        this.age = age;
        this.name = name;
    }

    protected void print() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    static class Address {
        private String state;
        private String city;
        private String street;

        public Address() {
        }

        public Address(String state, String street, String city) {
            this.state = state;
            this.street = street;
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "state='" + state + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }
}
