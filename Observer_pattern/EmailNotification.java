package Observer_pattern;


//EmailNotification service  will implement both order placed and cancelled interface because email will be send in both cases.
public class EmailNotification implements orderCancelled_subscriber , orderPlaced_subscriber{
    Amazon am;

    EmailNotification(Amazon am){
        am.registerForPlacingOrder(this ); //registerForPlacingOrder is Amazon method for adding to subscriber list of placing order
        am.registerToCancelOrder(this );//registerToCancelOrder  is Amazon method for adding to subscriber list of cancelling order
       // this.am = am;
    }
    // this means when we create an object of sercive at the time of creation only , it is added to the list.
    private void sendEmail(){
        System.out.println("email sent");
    }
    public void announceOrderPlaced(){
        sendEmail();
    }
    public void announceOrderCancelled(){
        sendEmail();
    }
}
