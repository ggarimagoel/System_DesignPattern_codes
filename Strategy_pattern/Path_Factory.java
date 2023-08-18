package Strategy_pattern;

public class Path_Factory {
    public static PathCalculator getPathCalculator(String mode){
        if(mode.equals("car")){
            return new car_PathCalculator();
        }
        else if(mode.equals("bike")){
            return new bike_PathCalculator();
        }
        else {
            throw new IllegalArgumentException("mode not supported");
        }
    }
}



/*
example


 sparrow{
     fly() {
       flying behavour = new fastFlying()
     }
 }
 */