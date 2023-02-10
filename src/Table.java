import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Table {
    private final int id;
    private final int max;
    private LocalDateTime busyTill;

    public LocalDateTime getBusyTill() {
        return busyTill;
    }

    public void setBusyTill(LocalDateTime busyTill) {
        this.busyTill = busyTill;
    }

    Map<LocalDateTime, WithoutReservation> reservations;

    Table(int id, int max) {
        this.id = id;
        this.max = max;
        this.reservations = new HashMap<>();
    }

    void reserve(LocalDateTime arrDateHour, int numOfGuests) {
        reservations.put(arrDateHour, new WithoutReservation(numOfGuests));
    }

    int getMax() {
        return max;
    }

    int getId() {
        return id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Table: %d - MAX: %d\n", id, max));
        reservations.forEach((k, v) -> sb.append(String.format("\tDate: %s/%s/ %s: %s\n",
                k.getDayOfMonth(), k.getMonth(),
                k.getHour(), v)));
        return sb.toString();
    }
}