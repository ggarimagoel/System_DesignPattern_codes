package Observer_pattern;

public class Client_amazon {
    public static void main(String[] args) {
        Amazon am = new Amazon();
        EmailNotification en = new EmailNotification(am);
        InvoiceGenerator ig = new InvoiceGenerator(am);
//          am.OrderCancelled();
            am.OrderPlaced();
    }
}
