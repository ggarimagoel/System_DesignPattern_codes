package decorator_pattern;

public class strawberryScoop implements IceCreamElements{
    private IceCreamElements iceCreamElements;

    strawberryScoop(IceCreamElements iceCreamElements){
        if(iceCreamElements == null){
            throw new IllegalArgumentException("scoop nwithout cone not allowed");
        }
        this.iceCreamElements = iceCreamElements;
    }
    @Override
    public int getCost() {
        return iceCreamElements.getCost() + 20;
    }
    public String getDescription(){
        return iceCreamElements.getDescription() + "Strawberry scoop ";
    }
}
