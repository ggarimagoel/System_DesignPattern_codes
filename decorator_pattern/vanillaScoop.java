package decorator_pattern;

public class vanillaScoop implements IceCreamElements{
    private IceCreamElements iceCreamElements;

    vanillaScoop(IceCreamElements iceCreamElements){
        if(iceCreamElements == null){
            throw new IllegalArgumentException("scoop nwithout cone not allowed");
        }
        this.iceCreamElements = iceCreamElements;
    }
    @Override
    public int getCost() {
            return iceCreamElements.getCost() + 10;
    }
    public String getDescription(){
            return iceCreamElements.getDescription() + "Vanilla scoop ";
    }
}
