package Observer_pattern;
import java.util.LinkedList;
import java.util.List;
public class Amazon {
    private List<orderCancelled_subscriber> orderCancelledList = new LinkedList<>();
    //list of services that are called  at the time of Placing order
    private List<orderPlaced_subscriber> orderPlacedList = new LinkedList<>();
    //list of services that are called  at the time of cancelling order


    public void registerForPlacingOrder(orderPlaced_subscriber subscriber){
        orderPlacedList.add(subscriber);
    }
    // services being added to list (order placed list)
    public void unregisterForPlacingOrder(orderPlaced_subscriber subscriber){
        orderPlacedList.remove(subscriber);
    }
    // services being removed from list (order placed list) , in case the service dont want to be part or order placed code.

    public void registerToCancelOrder(orderCancelled_subscriber subscriber){
        orderCancelledList.add(subscriber);
    }
    // services being added to list (order cancel list)

    public void unregisterToCancelOrder(orderCancelled_subscriber subscriber){
        orderCancelledList.remove(subscriber);
    }
    // services being removed from list (order cancel list) , in case the service dont want to be part or order cancel code.

    public void OrderPlaced(){
        for(orderPlaced_subscriber sub :orderPlacedList){
                sub.announceOrderPlaced();
        }
    }
    // iterate over the list of services to get indiviual service (sub/subscriber/ object of interface orderPlaced_subscriber )
    // and calling out their respective announceOrderPlaced() method.
    // eg for emailNotification, announceOrderPlaced methods sends email. etc etc..

    public void OrderCancelled(){
        for(orderCancelled_subscriber sub :orderCancelledList){
            sub.announceOrderCancelled();
        }
    }
    // iterate over the list of services to get indiviual service (sub/subscriber/ object of interface orderCancelled_subscriber )
    // and calling out their respective announceOrderCancelled() method.
    // eg for emailNotification, announceOrderCancelled methods sends email. etc etc..

}
