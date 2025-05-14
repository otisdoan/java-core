import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("QE180112", "12", "Le Doan Hieu");
        Employee employee = new Employee();
        TinhHieu tinhHieu = new TinhHieu();
        TinhTong tinhTong = new TinhTong();
        ExtendFinalClass extendFinalClass = new ExtendFinalClass();
        extendFinalClass.printName();
        int result1 = tinhTong.total(5, 4);
        int result = tinhHieu.total(5, 4);
        System.out.println(result);
        System.out.println(result1);
        employee.setAge("12");
        List<Person.Address> addresses = new ArrayList<Person.Address>();
        Person.Address address1 = new Person.Address();
        address1.setCity("Quy Nhon");
        address1.setState("Cali");
        address1.setStreet("02 Ho Van Hue");
        addresses.add(address1);
        person1.setAddress(addresses);
        System.out.println(employee);
    }
}
