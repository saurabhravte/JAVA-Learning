import java.util.Objects;

class ConcertTicket {
    private String showName;
    private String seatNumber;

    ConcertTicket(String showName, String seatNumber) {
        this.showName = showName;
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Concert Ticket {show name: " + showName + ", seatNumber = " + seatNumber + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                       // same reference
        if (o == null || getClass() != o.getClass()) return false;
        ConcertTicket other = (ConcertTicket) o;
        return Objects.equals(showName, other.showName)
                && Objects.equals(seatNumber, other.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showName, seatNumber);
    }
}

public class TicketMemory {
    public static void main(String[] args) {
        ConcertTicket t1 = new ConcertTicket("Coldplay", "2340");
        ConcertTicket t2 = new ConcertTicket("Coldplay", "2340");
        ConcertTicket t3 = new ConcertTicket("Coldplay", "2341");

        System.out.println(t1);
        System.out.println(t1.equals(t2));   // true
        System.out.println(t1.equals(t3));   // false
        System.out.println(t1.hashCode() == t2.hashCode()); // true
    }
}