public class GtaMission {
    static void main() {
        String fuelRemainingText = "empty";

        try {
            int fuelRemaining = Integer.parseInt(fuelRemainingText);
            System.out.println("Delivery the package. Fuel Left : " + fuelRemainingText);
        } catch (NumberFormatException exception){
            System.out.println("Reason " + exception.getMessage());
            System.out.println("Mission failed.");
        } finally {
            System.out.println("Returning to checkout...");
        }

    }
}
