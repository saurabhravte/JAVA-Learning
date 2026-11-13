public class CourceAccess {
    static void main() {
        String paymentStatus = "SUCCESS";

        if(paymentStatus.equals("SUCCESS")) {
            System.out.println("You have successfully paid for this cource");
        } else if(paymentStatus.equals("REFUND")) {
            System.out.println("You have refunded this cource");
        } else if(paymentStatus.equals("PENDING")) {
            System.out.println("You have paid this cource is pending");
        } else {
            System.out.println("Access not allowed");
        }
    }
}
