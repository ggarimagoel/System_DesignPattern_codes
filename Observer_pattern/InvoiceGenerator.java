package Observer_pattern;

public class InvoiceGenerator implements orderPlaced_subscriber{
    // only orderPlacedSubs required bec order cancel does not require invoice
        InvoiceGenerator(Amazon am){
        am.registerForPlacingOrder(this );
    }
    private void generateInvoice(){
        System.out.println("invoice generated");
    }
    public void announceOrderPlaced(){
        generateInvoice();
    }

}
