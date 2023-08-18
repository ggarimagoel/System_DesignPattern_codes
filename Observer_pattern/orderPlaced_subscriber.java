package Observer_pattern;


// this interface will be implemented by services who wants to be a parted of order creation,
// eg email notification, sms natification, paymement getaway, send notification to seller, inventory update , etc
public interface orderPlaced_subscriber {
    void announceOrderPlaced();
}
