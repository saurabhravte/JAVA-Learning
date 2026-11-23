class InvalidTicketException extends RuntimeException{
    InvalidTicketException(String message){
        super(message);
    }
}

class MovieSecurity {
    void enterTheater(String ticketCode, String screen, String seatNumber) throws Exception {
        if(!ticketCode.startsWith("TKT")){
            throw new InvalidTicketException("Invalid ticket number: "+ ticketCode);
        }

        System.out.println("Welcome to cinema");
        System.out.println("Screen: "+ screen);
        System.out.println("Seat Number: " + seatNumber);
    }
}
public class TheaterSecurity {
    static void main() {
        MovieSecurity movieSecuruity = new MovieSecurity();

        try {
            movieSecuruity.enterTheater(
                    "AMC-123","14","18B"
            );
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

    }
}
