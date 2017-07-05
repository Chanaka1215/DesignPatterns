package factoryPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class Samsung implements Mobile{
    private int ramSize;
    private String processor;

    public Samsung(int ramSize){
        this.ramSize=ramSize;
        System.out.println("Samsung is created "+hashCode());

    }

    public Samsung(String processor){
        this.processor = processor;
        this.ramSize =2;
        System.out.println("Samsung is created "+hashCode());

    }
}
