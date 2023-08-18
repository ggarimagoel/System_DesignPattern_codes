package Observer_pattern;



// this interface will be implemented by services who wants to be a parted of order cancellation,
// eg email notification, sms natification,details for  paymement refund, inventory update , etc
public interface orderCancelled_subscriber {
    void announceOrderCancelled();
}
