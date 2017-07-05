package factoryPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class MobileFactory {
    public static Mobile createMobile(String type){
        if(type.equals(Mobile.IPHONE)){
            return new IPhone(3,"A9","A9GPU");

        }else if(type.equals(Mobile.HTC)){
            return new HTC(2,"ARM");

        }else if(type.equals(Mobile.SAMSUNG)){
            return new Samsung(4);
        }else {
            return null;
        }
    }
}
