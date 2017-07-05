package singaltonPattern;

/**
 * Created by Chanaka Fernando on 7/5/2017.
 */
public class Sattalite {

    private static Sattalite _instance; //create a private satterlite instance

    private Sattalite(){
        //private constructor to avoid to use new keyword  for creating new Objects
    }

//    private  static  class SatelliteHelper{
//        private static final Sattalite _innerInsance= new Sattalite(); // this static method create a satelite object and no need to create a new one when call;
//    }

    //public static synchronized Sattalite getSallalite(){   //here synchronized is used to avoid call this method from 2 threads at a given time performance reduced
    public static  Sattalite getSallalite(){
        if(_instance == null){
            _instance = new Sattalite();
        }
        return _instance;
    }


}
