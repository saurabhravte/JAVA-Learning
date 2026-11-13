import java.util.Scanner;

public class MovieInvoice {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the movie name:");
        String movieName = sc.nextLine();

        System.out.println("Enter no of tickets:");
        int noOfTickets = sc.nextInt();

        double basePrice =4.55;
        double totalPrice = basePrice * noOfTickets;

        // summary of movie ticket
        System.out.println("Movie Invoice: ");
        System.out.println("Screening" + movieName);
        System.out.println("No of tickets: " + noOfTickets);
        System.out.println("Total ammount to pay:" + totalPrice);
    }
}
