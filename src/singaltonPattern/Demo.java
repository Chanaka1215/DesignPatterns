package singaltonPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class Demo {
    public static void main(String[] args){
        int i=0;
        while (i < 5){
            //Satellite s = new Sattalite();  because of the private constructor this call cant do
            System.out.println(Sattalite.getSallalite().hashCode());
            i++;
        }
    }
}
