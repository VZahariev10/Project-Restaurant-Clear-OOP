import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class MainClient {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.addTable(0, 2);
        restaurant.addTable(1, 4);
        restaurant.addTable(2, 6);
        restaurant.addTable(3, 8);
        restaurant.addTable(4, 10);

        LocalDate startDate = LocalDate.now();

        Random random = new Random();
        for (int s = 1; s <= 30; s++) {

            for (int i = 1; i <= 30; i++) {

                if (randomToThree() == 1) {
                    System.out.print("Clients without reservation : ");
                    withoutReserveTableScenario(restaurant
                            , LocalDateTime.of(LocalDate.from(startDate),
                                    LocalTime.of(random.nextInt(24),
                                            random.nextInt(60)))
                            , randomToTen());
                } else {
                    System.out.print("Clients with reservation    : ");
                    Reservation reservation = new Reservation(
                            randomToTen()
                            , randomString(10)
                            , LocalDateTime.of(LocalDate.from(startDate),
                            LocalTime.of(random.nextInt(24),
                                    random.nextInt(60)))
                    );

                    withReservationTableScenario(restaurant, reservation);
                }
            }
            System.out.println("\n\n\n");
        }
        System.out.println("Total reservations for this month: " + restaurant.getTotalReservations());
        System.out.println("Total tables used without reservation for this month: " + restaurant.getTotalNonReservations());
    }

    private static void withoutReserveTableScenario(Restaurant res, LocalDateTime date, int numOfGuests) {
        int table = res.unReservedTable(date, numOfGuests, false);
        if (table == -1) {
            System.out.println("No available table");
        } else {
            System.out.println("Table " + table + " with capacity " + res.getTables().get(table).getMax() + " is taken by " + numOfGuests + " people");
        }
    }

    private static void withReservationTableScenario(Restaurant res, Reservation reservation) {
        int table = res.unReservedTable(reservation.getTime(), reservation.getNumOfGuests(), true);
        if (table == -1) {
            System.out.println("No available table for reservation");
        } else {
            System.out.println("Reserved table " + table + " with capacity " + res.getTables().get(table).getMax() + " by the name of: " + reservation.getCustomerName()
                    + " for " + reservation.getNumOfGuests() + " people at: " + reservation.getTime().toString().replace("T", " "));
        }
    }

    static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static String randomString(int len) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static int randomToThree() {
        return new Random().nextInt(3) + 1;
    }

    public static int randomToTen() {
        return new Random().nextInt(10) + 1;
    }
}