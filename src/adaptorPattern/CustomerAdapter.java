package adaptorPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class CustomerAdapter extends NewCustomer implements Customer  {

    private OldCustomer oldCustomer;

    public CustomerAdapter(OldCustomer oldCustomer){
        this.oldCustomer=oldCustomer;
        this.adptData();
    }

    private void adptData(){
        this.setName(oldCustomer.getName());
        this.setAge(Integer.valueOf(oldCustomer.getAge()));
        Address address =new Address();
        String[] oldAddress =oldCustomer.getAddress().split(",");

        address.setStreetName(oldAddress[0]);
        address.setHouseNumber(Integer.valueOf(oldAddress[1]));
        address.setPostalCode(Integer.valueOf(oldAddress[2]));
        address.setCity(oldAddress[3]);
        this.setAddress(address);
    }

}
