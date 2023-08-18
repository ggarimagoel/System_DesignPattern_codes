package decorator_pattern;

public class client_Dp {
    public static void main(String[] args) {
        IceCreamElements ic = new chocoCone();
        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());

        IceCreamElements plusVscoop = new vanillaScoop(ic);
        System.out.println(plusVscoop.getCost());
        System.out.println(plusVscoop.getDescription());

        IceCreamElements plusChScoop = new chocoScoop(plusVscoop);
        System.out.println(plusChScoop.getCost());
        System.out.println(plusChScoop.getDescription());

        IceCreamElements plusChSyrup = new chocoSyrup(plusChScoop);
        System.out.println(plusChSyrup.getCost());
        System.out.println(plusChSyrup.getDescription());

        IceCreamElements plusnuts= new nutsToppings(plusChSyrup);
        System.out.println(plusnuts.getCost());
        System.out.println(plusnuts.getDescription());

    }
}
