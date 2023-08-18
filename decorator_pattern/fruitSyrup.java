package decorator_pattern;

public class fruitSyrup implements IceCreamElements{
    private IceCreamElements iceCreamElements;

    fruitSyrup(IceCreamElements iceCreamElements){
        if(iceCreamElements == null){
            throw new IllegalArgumentException("without cone not allowed");
        }
        this.iceCreamElements = iceCreamElements;
    }
    @Override
    public int getCost() {
        return iceCreamElements.getCost() + 5;
    }
    public String getDescription(){
        return iceCreamElements.getDescription() + "fruitSyrup ";
    }
}
