import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    private final List<Table> tables = new ArrayList<>();
    private int totalReservations;
    private int totalNonReservations;

    public int getTotalNonReservations() {
        return totalNonReservations;
    }

    public String getName() {
        return name;
    }

    public Restaurant() {
        this.name = "NAPOLLI";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalNonReservations(int totalNonReservations) {
        this.totalNonReservations = totalNonReservations;
    }

    public List<Table> getTables() {
        return tables;
    }

    public int getTotalReservations() {
        return totalReservations;
    }

    public void setTotalReservations(int totalReservations) {
        this.totalReservations = totalReservations;
    }

    public int unReservedTable(LocalDateTime date, int numOfGuests, boolean reservation) {
        for (Table table : tables) {
            if (table.getMax() >= numOfGuests
                    &&
                    (null == table.getBusyTill()
                            ||
                            (date.isAfter(table.getBusyTill()) || date.isBefore(table.getBusyTill().minusHours(2))))) {
                table.reserve(date, numOfGuests);
                if (reservation) {
                    totalReservations++;
                } else {
                    totalNonReservations++;
                }
                table.setBusyTill(date.plusHours(2));
                return table.getId();
            }
        }
        return -1;
    }

    public void addTable(int id, int max) {
        tables.add(new Table(id, max));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nRESTAURANT TABLE WITHOUT RESERVATIONS\n");
        for (Table t : tables) {
            sb.append(t);
        }
        return sb.toString();
    }
}