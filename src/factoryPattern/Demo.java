package factoryPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class Demo {
    public static void main(String[] args){
        //MobileFactory mobileFactory = new MobileFactory(); //not going to call this morethan one time therefore createMobile method changes to static then it can call just using Class name
        //Mobile mobile = mobileFactory.createMobile(Mobile.SAMSUNG);
        Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
    }
}
