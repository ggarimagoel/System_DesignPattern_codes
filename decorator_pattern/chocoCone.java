package decorator_pattern;

public class chocoCone implements IceCreamElements{
    private IceCreamElements iceCreamElements;
    chocoCone(){ // default constructor
    }
    chocoCone(IceCreamElements iceCreamElements){
        this.iceCreamElements = iceCreamElements;
    }
    @Override
    public int getCost() {
        if(iceCreamElements != null) {
            return iceCreamElements.getCost() + 30;
        }
        return 30;
    }
    public String getDescription(){
        if(iceCreamElements != null) {
            return iceCreamElements.getDescription() + "choco cone";
        }
        return  "choco cone";
    }
}
