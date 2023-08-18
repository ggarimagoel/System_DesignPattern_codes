package decorator_pattern;

public class fruitToppings implements IceCreamElements{
    private IceCreamElements iceCreamElements;

    fruitToppings(IceCreamElements iceCreamElements){
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
        return iceCreamElements.getDescription() + "fruit toppings ";
    }
}
