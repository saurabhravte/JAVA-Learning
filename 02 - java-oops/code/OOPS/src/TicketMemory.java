class ConcertTicket {
    private String showName;
    private String seatNumber;

    ConcertTicket(String showName, String seatNumber){
        this.showName = showName;
        this.seatNumber = seatNumber;

        //    tostring
        @Override
        public String toString(){
            return  "Concert Ticket {show name: " + showName + ", seatNumber = " + seatNumber +"}"
        }
    }


}

public class TicketMemory {
    static void main() {
        ConcertTicket ticket = new ConcertTicket("Coldplay", 2340);
        System.out.println(ticket);
    }
}
