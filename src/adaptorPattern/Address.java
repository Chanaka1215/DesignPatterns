package adaptorPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class Address {
    private String streetName;
    private int houseNumber;
    private int postalCode;
    private String city;

    public void setStreetName(String streetName){
        this.streetName=streetName;
    }

    public String getStreetName(){
        return streetName;
    }

    public void setHouseNumber(int houseNumber){
        this.houseNumber=houseNumber;
    }

    public int getHouseNumber(){
        return houseNumber;
    }

    public void setPostalCode(int postalCode){
        this.postalCode=postalCode;
    }

    public int getPostalCode(){
        return postalCode;
    }

    public void setCity(String city){
        this.city=city;
    }

    public String getCity(){
        return city;
    }

    public String toString(){
        return "Street : "+this.getStreetName()+"\n House Number : "+this.getHouseNumber()+"\n Postal code : "+this.getPostalCode()+"\n City : "+this.getCity();
    }
}
