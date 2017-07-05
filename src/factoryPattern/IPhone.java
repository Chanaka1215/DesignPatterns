package factoryPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class IPhone implements Mobile {
    private int ramSize;
    private String procesor;
    private String GPU;

    public IPhone(int ramSize, String procesor,String GPU){
        this.ramSize = ramSize;
        this.procesor=procesor;
        this.GPU=GPU;
        System.out.println("Iphone is created "+hashCode());
    }

}
