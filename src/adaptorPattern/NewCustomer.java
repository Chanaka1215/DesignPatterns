package adaptorPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class NewCustomer implements Customer {
    private String name;
    private int age;
    private Address address;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address){
        this.address=address;
    }
}
