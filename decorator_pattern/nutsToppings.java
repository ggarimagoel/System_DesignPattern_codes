package decorator_pattern;

public class nutsToppings implements IceCreamElements{
    private IceCreamElements iceCreamElements;

    nutsToppings(IceCreamElements iceCreamElements){
        if(iceCreamElements == null){
            throw new IllegalArgumentException(" without cone not allowed");
        }
        this.iceCreamElements = iceCreamElements;
    }
    @Override
    public int getCost() {
        return iceCreamElements.getCost() + 15;
    }
    public String getDescription(){
        return iceCreamElements.getDescription() + " nuts toppings ";
    }
}
