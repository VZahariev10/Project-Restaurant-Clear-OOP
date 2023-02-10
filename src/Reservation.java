import java.time.LocalDateTime;

public class Reservation {

    private final String customerName;
    private final int numOfGuests;
    private final LocalDateTime time;

    public String getCustomerName() {
        return customerName;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public LocalDateTime getTime() {
        return time;
    }

    Reservation(int numOfGuests, String custName, LocalDateTime time) {
        this.customerName = custName;
        this.numOfGuests = numOfGuests;
        this.time = time;
    }

    public String toString() {
        return String.format("%d persons at name: %s", numOfGuests, customerName);
    }
}