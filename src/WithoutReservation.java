public class WithoutReservation {
    private final int numOfGuests;

    WithoutReservation(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    public String toString() {
        return new String(numOfGuests + " persons.");
    }
}