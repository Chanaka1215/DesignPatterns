package factoryPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class HTC  implements Mobile{
    private int ramSize;
    private String processor;

    public HTC(int ramSize,String processor){
        this.ramSize =ramSize;
        this.processor=processor;
        System.out.println("HTC is created "+hashCode());

    }
}
