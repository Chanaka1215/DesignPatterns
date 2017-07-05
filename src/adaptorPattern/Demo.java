package adaptorPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class Demo {
    public static void main(String[] ags){
        OldCustomer oldCustomer=new OldCustomer();
        oldCustomer.setName("Chanaka");
        oldCustomer.setAge("23");
        oldCustomer.setAddress("Giragaa landsale,16,21300,Matale");

        Customer customer = new CustomerAdapter(oldCustomer);
        System.out.println(customer.getName());
        System.out.println(customer.getAddress());
        System.out.println(customer.getAge());
    }
}
