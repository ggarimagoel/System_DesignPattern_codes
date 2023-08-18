package decorator_pattern;

public class chocoScoop implements  IceCreamElements{
    private IceCreamElements iceCreamElements;

    chocoScoop(IceCreamElements iceCreamElements){
        if(iceCreamElements == null){
            throw new IllegalArgumentException("without cone not allowed");
        }
        this.iceCreamElements = iceCreamElements;
    }
    @Override
    public int getCost() {
        return iceCreamElements.getCost() + 20;
    }
    public String getDescription(){
        return iceCreamElements.getDescription() + "choco scoop ";
    }
}
