package decorator_pattern;

public class mangoCone implements IceCreamElements{
    private IceCreamElements iceCreamElements;
    mangoCone(){ // default constructor

    }
    mangoCone(IceCreamElements iceCreamElements){
        this.iceCreamElements = iceCreamElements;
    }

    @Override
    public int getCost() {
        if(iceCreamElements != null) {
            return iceCreamElements.getCost() + 40;
        }
        return 30;
    }
    public String getDescription(){
        if(iceCreamElements != null) {
            return iceCreamElements.getDescription() + "mango cone";
        }
        return  "mango cone";
    }

}
