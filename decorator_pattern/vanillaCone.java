package decorator_pattern;

public class vanillaCone implements  IceCreamElements{
    private IceCreamElements iceCreamElements;
    vanillaCone(){ // default constructor
    }
    vanillaCone(IceCreamElements iceCreamElements){
        this.iceCreamElements = iceCreamElements;
    }
    @Override
    public int getCost() {
        if(iceCreamElements != null) {
            return iceCreamElements.getCost() + 20;
        }
        return 30;
    }
    public String getDescription(){
        if(iceCreamElements != null) {
            return iceCreamElements.getDescription() + "vanilla cone";
        }
        return  "vanilla cone";
    }
}
